package lab01;

import java.util.Scanner;

public class Zadanie4 { // nazwalem plik Zadanie4 a wiec klasa tez tak musi sie nazywac
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // brak srednika

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // porownanie to 2 rowna sie a nie 1
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // brak srednika
        }

        for (int i = 0; i <= 5; i++) { // jesli zadanie programu to bylo wypisywanie coraz mniejszych liczb to dziala poprawnie ale ja zmienie na i++
            System.out.println(i);
        }

        scanner.close();
    }
}