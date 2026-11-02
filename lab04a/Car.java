package lab04a;

public class Car extends Vehicle{
    private int numberOfDoors;
    private boolean brand;
    private boolean model;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void showInformation()
    {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.numberOfDoors);
    }
}
