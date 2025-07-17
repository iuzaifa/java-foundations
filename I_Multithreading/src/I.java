import basics.Test;
import basics.World;

public class I {
    public static void main(String[] args) {
        System.out.println(" Hello Multithreading " + Thread.currentThread().getName()); // gives current thread name

        Test test = new Test();
        World world = new World();
        test.start();
        world.start();


    }
}
