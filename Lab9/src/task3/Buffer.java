package task3;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private int data;
    private boolean available = false;

    public void produce(int value) {
        while (available) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Производитель добавил: " + value);
        available = true;
    }

    public void consume() {
        while (!available) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Потребитель забрал: " + data);
        available = false;
    }
}