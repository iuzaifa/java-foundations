package Day3OOPs.constructorAndClasses;

public class ConstructorAndClasses1 {

    static void main() {
        CarClass carClass = new CarClass();
        carClass.brand = "Toyota";
        carClass.color  = "red";
        carClass.speed  = 134.4f;
        carClass.drive();



        CarClassWithConstructor c1 = new CarClassWithConstructor();


        CarClassWithConstructor carCons = new CarClassWithConstructor("KIA", "White", 245.5f);
        carCons.drive();
    }
}


// single Class
class CarClass {
    String brand;
    String color;
    float speed;

    void drive(){
        System.out.println(  color + " " + brand + " Rohan drive the card at speed of " + speed);

    }
}

// class with constructor
class CarClassWithConstructor {
    String brand;
    String color;
    float speed;

    public CarClassWithConstructor() {
        color = "red";
        brand = "BMW";
        speed = 246.6f;
        System.out.println(  color + " " + brand + " Rohan drive the card at speed of " + speed);
    }

    public CarClassWithConstructor(String brand, String color, float speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }


    void drive(){
        System.out.println(  color + " " + brand + " Rohan drive the card at speed of " + speed);
    }
}
