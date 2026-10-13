package lab01;

import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[10];
        for(int i = 0; i<10; i++)
        {
            System.out.println("Podaj n: ");
            int n = scanner.nextInt();
            tab[i] = n;
        }

        int min = tab[0];
        int max = tab[0];
        int sum = 0;
        for(int i = 0; i<tab.length; i++)
        {
            if(tab[i]>max)
            {
                max = tab[i];
            }
            if(tab[i]<min)
            {
                min = tab[i];
            }

            sum += tab[i];
        }

        float avg = (float) sum/tab.length;
        int higherThanAvg = 0;
        for(int i = 1; i<tab.length; i++)
        {
            if(tab[i]>avg)
            {
                higherThanAvg++;
            }
        }

        System.out.printf("%d, %d, %d, %f, %d", min, max, sum, avg, higherThanAvg);
    }
}
