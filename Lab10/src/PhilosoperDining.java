import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class PhilosoperDining {
    public static void main(String[] args) {
        int philosopherCount = 5;
        Semaphore[] forks = new Semaphore[philosopherCount];
        Philosopher[] philosophers = new Philosopher[philosopherCount];
        ExecutorService executorService = Executors.newFixedThreadPool(philosopherCount);
        long durationMillis = 5000; 

        for (int i = 0; i < philosopherCount; i++) {
            forks[i] = new Semaphore(1);
        }
        for (int i = 0; i < philosopherCount; i++) {
            Semaphore left = forks[i];
            Semaphore right = forks[(i + 1) % philosopherCount];
            if (i == philosopherCount - 1) {
                philosophers[i] = new Philosopher(i, left, right, durationMillis);
            } else {
                philosophers[i] = new Philosopher(i, right, left, durationMillis);
            }
            executorService.execute(philosophers[i]);
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(durationMillis + 1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (Philosopher philosopher : philosophers) {
            System.out.println("Философ " + philosopher.getId() + " поел " + philosopher.getMealsEaten() + " раз.");
        }
    }
}
