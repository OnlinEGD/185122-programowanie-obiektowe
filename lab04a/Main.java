package lab04a;

public class Main {
    public static void main(String[] args)
    {
        // wypisze Klasa A, Klasa B, Klasa C w kolejnych liniach
        new C();

        Book book = new Book("tak", "Daniel Sobczyk", 1939);

        System.out.println(book);

        System.out.println(book.getClass());

    }
}
