package basics.threadMethods;

import basics.ThreadLifeCycle.MyThread;

public class MThread {

    // For Master Thread


    public static void main(String[] args) throws InterruptedException {

        // Method 1 -> Start
        // Method 2 -> Run Contains the code that runs when the thread starts ;
        // Method 3 -> sleep()
        // Method 4 -> join()


        MyThreadA a = new MyThreadA();
        MyThreadB b = new MyThreadB();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        threadA.join(); // Waits for a thread to finish current thread
        threadB.start();






    }
}
