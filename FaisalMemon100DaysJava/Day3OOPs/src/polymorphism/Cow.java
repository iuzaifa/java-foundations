package polymorphism;

public class Cow  extends Animal{


    public Cow(String animalType) {
        super(animalType);
    }

    @Override
    void sound() {
        System.out.println("Cow moos 🐄");
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();
        sound();
    }
}
