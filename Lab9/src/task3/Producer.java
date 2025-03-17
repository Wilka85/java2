package task3;

import java.util.Random;

public class Producer implements Runnable {
    private final Buffer buffer;
    private final Random random = new Random();

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = random.nextInt(100);
            buffer.produce(value);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}