package classesDemo;

// It can Just name of The "Car"  for understanding I use Class
public class CarClass {

   String brand;
   String color;
   String model;

    // Constructor to initialize an empty object
    public CarClass() {
    }


    // Constructor to initialize an object
    public CarClass(String brand, String color, String model) {
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    // Method (Behavior/Action)
    public void speed(){
        System.out.println(brand + " can get speed in just 14sec 140per Mile");
    }
}
