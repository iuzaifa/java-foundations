package basics.threadMethods;

public class MyThreadB implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println( "--- B ");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
