package recordsInJava;

record Bike (String brand, int speed){}
public class RecordDemo{
    public static void main(String[] args) {
        System.out.println("implementing Record ");
        Bike bike = new Bike("Hero", 120);
        System.out.println("Brand : " + bike.brand());
        System.out.println("Speed : " + bike.speed());

    }
}
