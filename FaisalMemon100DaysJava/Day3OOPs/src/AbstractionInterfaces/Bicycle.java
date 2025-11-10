package AbstractionInterfaces;

public class Bicycle implements Drivable{
    @Override
    public void startEngine() {
        System.out.println("Bicycle ready to ride (no engine).");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Bicycle pedaling faster to reach " + speed + " mph.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle hand brakes squeezed.");
    }
}
