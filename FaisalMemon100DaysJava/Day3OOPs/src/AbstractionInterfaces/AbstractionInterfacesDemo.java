package AbstractionInterfaces;

public class AbstractionInterfacesDemo {
    public static void main(String[] args) {

        Drivable vehicle1 = new Car();

        System.out.println("--- Using the Car ---");
        vehicle1.startEngine();
        vehicle1.accelerate(60);
        vehicle1.brake();


        System.out.println("\n--- Using the Bicycle ---");
        Drivable vehicle2 = new Bicycle();

        vehicle2.startEngine();
        vehicle2.accelerate(15);
        vehicle2.brake();


    }
}
