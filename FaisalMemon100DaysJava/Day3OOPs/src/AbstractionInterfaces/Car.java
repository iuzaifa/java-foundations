package AbstractionInterfaces;

public class Car implements Drivable{


    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key turn.");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " mph by pressing the gear pedal.");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes applied.");
    }
}
