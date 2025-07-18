package basics.synchronization;

public class M {
    public static void main(String[] args) {

        Counter counter = new Counter();

        AThread aThread = new AThread(counter);
        AThread bThread = new AThread(counter);

        aThread.start();
        bThread.start();

        try {
            aThread.join();
            bThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
