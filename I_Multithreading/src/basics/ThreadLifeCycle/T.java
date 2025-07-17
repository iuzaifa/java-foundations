package basics.ThreadLifeCycle;

public class T {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);

        System.out.println( " State Before Start Thread: " + thread.getState()); // NEW
        thread.start();
        System.out.println( " State after Start Thread : " + thread.getState()); // RUNNABLE
        Thread.sleep(100);

        System.out.println( " State after Sleeping  Thread : " + thread.getState()); // TIMED_WAITING
        thread.join();

        System.out.println( " State after Finishing All Threads : " + thread.getState()); // TIMED_WAITING







    }
}
