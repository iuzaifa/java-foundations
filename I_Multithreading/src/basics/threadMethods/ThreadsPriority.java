package basics.threadMethods;

public class ThreadsPriority {

    public static void main(String[] args) {
        //A a = new A("Abu Huzaifa");
        //a.start();

        A l = new A("Low Priority Thread");
        A m = new A("Mid Priority Thread");
        A h = new A("Height Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        h.start();



    }
}


class A extends Thread{

    public A(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            String a = " ";
            for (int j = 0; j < 10000; j++){
                a += "a " + 1;
            }
            System.out.println(Thread.currentThread().getName() + " Priority : "+
                    Thread.currentThread().getPriority() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadsPriority B ");
    }
}