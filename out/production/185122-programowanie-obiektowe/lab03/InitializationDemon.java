package lab03;

public class InitializationDemo{
    static int pole;
    int pole2;

    static
    {
        System.out.println("Inicjalizacja klasy");
    }

    {
        System.out.println("Tworzenie nowego obiektu");
    }

    public InitializationDemo(int pole)
    {
        System.out.println("Konstruktor");
        this.pole2 = pole;
    }


}
