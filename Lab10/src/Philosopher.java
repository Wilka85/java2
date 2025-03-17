import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class Philosopher implements Runnable {
    private final int id;
    private final Semaphore leftFork;
    private final Semaphore rightFork;
    private final long endTime;
    private int mealsEaten = 0;

    public Philosopher(int id, Semaphore leftFork, Semaphore rightFork, long durationMillis) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.endTime = System.currentTimeMillis() + durationMillis;
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " думает");
        Thread.sleep((int) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " ест");
        Thread.sleep((int) (Math.random() * 1000));
        mealsEaten++;
    }

    public int getMealsEaten() {
        return mealsEaten;
    }
    public int getId() {
        return id;
    }


    @Override
    public void run() {
        while (System.currentTimeMillis() < endTime) {
            try {
                think();
                if (!leftFork.tryAcquire(100, TimeUnit.MILLISECONDS)) {
                    continue;
                }
                System.out.println("Философ " + id + " взял левую вилку");
                if (!rightFork.tryAcquire(100, TimeUnit.MILLISECONDS)) {
                    leftFork.release();
                    continue;
                }
                System.out.println("Философ " + id + " взял правую вилку");
                eat();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                rightFork.release();
                System.out.println("Философ " + id + " положил правую вилку");
                leftFork.release();
                System.out.println("Философ " + id + " положил левую вилку");
            }
        }
    }
}
