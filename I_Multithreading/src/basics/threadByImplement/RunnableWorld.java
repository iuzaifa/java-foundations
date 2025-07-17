package basics.threadByImplement;

public class RunnableWorld implements Runnable{
    @Override
    public void run() {
        for( ; ; ){
            System.out.println(" ------------------------ RunnableWorld"  + Thread.currentThread().getName());
        }
    }
}
