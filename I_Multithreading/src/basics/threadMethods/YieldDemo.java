package basics.threadMethods;

public class YieldDemo {
    public static void main(String[] args) {
        YieldA yieldA = new YieldA();
        YieldB yieldB = new YieldB();


        yieldA.setName("Thread A");
        yieldB.setName("Thread B");
        yieldA.start();
        yieldB.start();

    }
}

class YieldA extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " : "+ i);
            Thread.yield(); // Stop
        }
    }
}


// Always Runs First This Thread A is calling Yield 
class YieldB extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " : "+ i);
        }
    }
}
