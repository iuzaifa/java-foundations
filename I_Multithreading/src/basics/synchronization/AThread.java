package basics.synchronization;

public class AThread extends Thread {

    private Counter counter;


    public AThread(Counter counter) {
        this.counter = counter;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            counter.incrementCount();
        }
    }
}
