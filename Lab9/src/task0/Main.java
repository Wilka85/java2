package task0;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{

        });
        Thread runnable = new Thread(()->{
            while (true){

            }
        });
        runnable.start();
        Object obj = new Object();
        Thread BlockedThread = new Thread(()->
        {
            synchronized (obj)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }) ;
        Thread LockThread = new Thread(()->
        {
            synchronized (obj)
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {

                }
            }
        }) ;
        LockThread.start();
        Thread.sleep(100);
        BlockedThread.start();
        Object waitingLock = new Object();
        Thread WaitingThread = new Thread(()->
        {
            synchronized (waitingLock)
            {
                try {
                    waitingLock.wait();
                } catch (InterruptedException e) {

                }
            }
        }) ;
        WaitingThread.start();
        Thread.sleep(100);
        Thread TimeWaitingThread = new Thread(()->
        {


                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }

        }) ;
        TimeWaitingThread.start();
        Thread TerminatedThread = new Thread(()->
        {
            System.out.println("end of thread");
        }) ;
        TerminatedThread.start();
        TerminatedThread.join();
        System.out.println("new"+thread.getState());
        System.out.println("runnable"+runnable.getState());
        System.out.println(BlockedThread.getState());
        System.out.println(WaitingThread.getState());
        System.out.println(TimeWaitingThread.getState());
        System.out.println(TerminatedThread.getState());

    }
}
