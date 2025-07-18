package basics.daman;

public class MThread {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        threadA.setDaemon(true);
        threadA.start();
        System.out.println("Work Done !");
    }
}


class ThreadA extends Thread{

    @Override
    public void run() {
        while (true ){
            System.out.println("Hello Word ");
        }
    }
}