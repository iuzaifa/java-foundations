package basics.threadByExtend;

public class Test  extends Thread{


    @Override
    public void run() {
        for ( ;  ; ){
            System.out.println("----------Test" + Thread.currentThread().getName());
        }
    }
}
