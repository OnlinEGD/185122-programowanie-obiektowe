public class Main {
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Kamil", true, 4);
        Dog d2 = new Dog("Kiribati", false, 5);

        d1.bark();
        d2.showInformation();

        Point p1 = new Point(2,5);
        Point p2 = new Point(5, 3);
        System.out.println(p1.distance(p2));

        Book b1 = new Book();
        Book b2 = new Book("Nadchodzi zima", "Garry Kasparow");
        Book b3 = new Book("Inny swiat", "Gustaw Herling-Grudzinski", 1967);

        Car original = new Car("Ford", "Fiesta", 2006, 200000);
        Car copy = new Car(original);
        copy.brand = "Opel";
        copy.model = "Astra";
        System.out.println(original.brand);
        System.out.println(copy.brand);

        Person first = new Person("Anna");
        Person secondButReference = first;

        secondButReference.name = "Maria";
        first.introduceYourself();
        secondButReference.introduceYourself();

        Person secondButCopy = new Person(first);
        first.name = "Anna";
        secondButCopy.name = "Maria";
        first.introduceYourself();
        secondButCopy.introduceYourself();

        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increaseOther(c2);
        System.out.println(c1.value);
        System.out.println(c2.value);

        Car car = null;
        // powinien byc wyjatek typu NullPointerException a wiec dodajemy warunek zabezpieczajacy
        if(car != null)
        {
            car.showInformation();
        }

        Product product = new Product("Monitor", 1200);
        product.show();

    }
}