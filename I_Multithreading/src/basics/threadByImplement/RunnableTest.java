package basics.threadByImplement;

public class RunnableTest implements Runnable{


    @Override
    public void run() {

        for( ; ; ){
            System.out.println(" ------------ RunnableTest"  + Thread.currentThread().getName());
        }
    }
}
