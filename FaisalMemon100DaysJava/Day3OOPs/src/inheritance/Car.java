package inheritance;

public class Car extends Vehicle {
    private final int doors;


    public Car(String brand, int speed , int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Doors : " + doors);
    }
}
