package basics.threadByExtend;

public class I {
    public static void main(String[] args) {
//        System.out.println(" Hello Multithreading " + Thread.currentThread().getName()); // gives current thread name

        World world = new World();
        Test test = new Test();

        world.start();
        test.start();


    }
}
