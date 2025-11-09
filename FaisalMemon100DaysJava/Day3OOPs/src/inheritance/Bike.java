package inheritance;

public class Bike extends Vehicle {
    private double price;
    private boolean hasCarrier;


    public Bike(String brand, int speed, double price, boolean hasCarrier) {
        super(brand, speed);
        this.price = price;
        this.hasCarrier = hasCarrier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Price : " + price);
        System.out.println("Has Carrier : " + hasCarrier);
    }
}
