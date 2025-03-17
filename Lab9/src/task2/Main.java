package task2;

public class Main {
    public static void main(String[] args) {
        Object lock= new Object();
        Thread thread = new MyThread("Thread1",lock,true);
        Thread thread1 = new MyThread("Thread2",lock,false);
        thread.start();
        thread1.start();
    }
}
