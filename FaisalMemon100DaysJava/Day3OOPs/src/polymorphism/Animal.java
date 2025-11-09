package polymorphism;

public class Animal {
    private String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }

    public void displayAnimal(){
        System.out.println("Animal Type : " + animalType);
    }
}
