package task2;

public class MyThread extends Thread {
    private final Object lock;
    private static boolean turn = true;
    private final boolean myTurn;

    public MyThread(String name, Object lock, boolean myTurn) {
        super(name);
        this.lock = lock;
        this.myTurn = myTurn;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (lock) {
                while (turn != myTurn) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(getName());
                turn = !turn;
                lock.notifyAll();
            }
        }
    }
}