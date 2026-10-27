public class Dog {
    String name;
    boolean breed;
    int age;
    public Dog(String name, boolean breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark()
    {
        System.out.println("Wow Wow");
    }

    public void showInformation()
    {
        System.out.printf("nazwa: %s, najedzony: %b, wiek: %d", name, breed, age);
        System.out.println();
    }
}


