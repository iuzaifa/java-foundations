package basics.threadMethods;

public class MyThreadA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println( "------ A ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
