package basics.threadMethods;

public class ThreadM {

    // For Master Thread


    public static void main(String[] args) throws InterruptedException {

        // Method 1 -> Start
        // Method 2 -> Run Contains the code that runs when the thread starts ;
        // Method 3 -> sleep()
        // Method 4 -> join()


        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        Thread threadA = new Thread(a);
        Thread threadB = new Thread(b);

        threadA.start();
        threadA.join(); // Waits for a thread to finish current thread
        threadB.start();






    }
}
