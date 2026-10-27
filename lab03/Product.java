package lab03;

public class Product {
    String name;
    double price;
    static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 10;
    public Product()
    {
        if(numberOfProducts == MAX_PRODUCTS)
        {
            return;
        }
        numberOfProducts++;
    }

    static public int getNumberOfProducts()
    {
        return numberOfProducts;
    }
}
