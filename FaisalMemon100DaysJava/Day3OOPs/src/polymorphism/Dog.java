package polymorphism;

public class Dog  extends Animal{

    public Dog(String animalType) {
        super(animalType);
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();
        sound();
    }
}
