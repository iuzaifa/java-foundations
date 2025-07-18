package basics.synchronization;

public class Counter {

    private int count = 0;

//    public synchronized void incrementCount(){
//        ++count;
//    }


    public void incrementCount(){
        // for special case , to set only needed block of code
        synchronized(this){
            ++count;
        }
    }



    public int getCount() {
        return count;
    }


}
