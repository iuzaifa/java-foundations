package classesDemo;
public class Main {
    public static void main(String[] args) {
        // pass value to  Fields (State/Properties) individual without any method use
        CarClass carClass = new CarClass();
        carClass.brand = "BMW";
        carClass.color = "RED";
        carClass.model = "2025";
        System.out.println("The car name is "+ carClass.brand + " , color "+ carClass.color
        + " and model is " + carClass.model);
        carClass.speed();


        System.out.println();

        CarClass withConstructor = new CarClass("Audi", "Orange", "2023");
        System.out.println("The car name is "+ withConstructor.brand + " , color "+ withConstructor.color
                + " and model is " + withConstructor.model);
        withConstructor.speed();





    }
}