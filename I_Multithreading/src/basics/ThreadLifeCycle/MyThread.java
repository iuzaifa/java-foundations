package basics.ThreadLifeCycle;

public class MyThread implements Runnable {


    @Override
    public void run() {
//        for ( ;  ; ){
//            System.out.println("Thread Life Cycle ");
//        }
        System.out.println("Running State"); // running
        try {
            Thread.sleep(2000);
            System.out.println("Pause for 2 SEC");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
