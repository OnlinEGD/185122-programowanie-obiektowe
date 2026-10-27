package lab03.app;

import lab03.animal.Cat;
import lab03.animal.Dog;

public class Main {
    public static void main(String[] args)
    {
        Cat c = new Cat();
        Dog d = new Dog();
        c.makeSound();
        d.makeSound();
    }
}
