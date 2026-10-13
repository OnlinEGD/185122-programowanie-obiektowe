package lab01;

import java.util.Scanner;

public class Zadanie2 {
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int n = scanner.nextInt();
        if(n%2==0)
        {
            System.out.println("Liczba jest parzysta");
        }
        if(n%3==0)
        {
            System.out.println("Liczba jest podzielna przez 3");
        }
        int suma = 0;
        for(int i = 0; i<=n; i++)
        {
            suma += i;
        }
        System.out.println(suma);
        scanner.close();
    }
}
