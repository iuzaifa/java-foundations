package basics;

public class World extends Thread {

    @Override
    public void run() {
        for ( ; ;){ // infinite loop
            System.out.println("--------------------World");
        }
    }
}
