package concreteClassOrNormalClass;

public class Demo1 {
    public static void main(String[] args) {

        Car car = new Car(); // object created
        car.brand = "Tesla";
        car.year = 2024;

        System.out.println(car.brand);
        System.out.println(car.year);
        car.start();


    }
}
