package basics.threadByImplement;

public class J {
    public static void main(String[] args) {

        RunnableTest runnableTest = new RunnableTest();
        RunnableWorld runnableWorld = new RunnableWorld();

        Thread thread1 = new Thread(runnableTest);
        Thread thread2 = new Thread(runnableWorld);

        thread1.start();
        thread2.start();

    }
}
