package lab04a;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return("Tytul; " + this.title + ", autor: " + this.author + ", rok: " + this.publicationYear);
    }
}
