public class Car
{
    String brand;
    String model;
    int productionYear;
    int mileage;
    public Car()
    {

    }
    public Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }
    public Car(String brand, String model, int productionYear, int mileage)
    {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }
    Car(Car other)
    {
       this.brand = other.brand;
       this.model = other.model;
       this.productionYear = other.productionYear;
       this.mileage = other.mileage;
    }

    public void drive(double distance)
    {
        if(distance>0)
        {
            this.mileage += distance;
        }
    }

    public void showInformation()
    {
        if(this == null){ return; }
        System.out.printf("marka: %s, model: %s, rok: %d, przebieg %d", brand, model, productionYear, mileage);
        System.out.println();
    }
}
