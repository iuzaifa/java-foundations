package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {

        System.out.println("-------------------- CAR INFO ----------------------------------------------------");
        Car car = new Car("TATA", 350, 4);
        car.displayInformation();

        System.out.println("--------------------  BIKE INFO ----------------------------------------------------");

        Bike bike = new Bike("YAMAHA", 240, 180000.00, true);
        bike.displayInformation();
    }
}
