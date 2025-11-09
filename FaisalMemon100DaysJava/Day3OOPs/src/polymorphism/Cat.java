package polymorphism;

public class Cat extends Animal{
    private String breed;


    public Cat(String animalType, String breed) {
        super(animalType);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void displayAnimal() {
        super.displayAnimal();
        System.out.println("Breed : " + breed );
        sound();
    }
}
