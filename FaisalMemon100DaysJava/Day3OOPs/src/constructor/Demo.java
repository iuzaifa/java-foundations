package constructor;

public class Demo {
    public static void main(String[] args) {
        Car car =new Car("Tesla", "Audi-X5", 2025);
        System.out.println(car.brand+ " " +car.model+ " " +car.year);

        System.out.println(car.getBrand()); // getting car brand by getter

        car.setBrand("BMW"); // set new car
        System.out.println(car.brand+ " " +car.model+ " " +car.year);

    }
}
