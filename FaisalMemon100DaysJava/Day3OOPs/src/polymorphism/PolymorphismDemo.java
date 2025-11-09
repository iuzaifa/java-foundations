package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
//        System.out.println("--------- CAT");
//        Cat c = new Cat("Pet Animal", "XYZ");
//        c.displayAnimal();
//
//        System.out.println("--------- DOG ---- ");
//        Dog d = new Dog("Pet Animal");
//        d.displayAnimal();
//
//        System.out.println("--------- DOG ---- ");
//        Cow cw = new Cow("Pet Animal");
//        cw.displayAnimal();

        // this Method is called runtime Polymorphism
        Animal a1 = new Cat("Pet Animal", "XYZ");
        a1.displayAnimal();
        Animal a2 =  new Dog("Pet Animal");
        a2.displayAnimal();
        Animal a3 = new Cow("Pet Animal");;
        a3.displayAnimal();






    }
}
