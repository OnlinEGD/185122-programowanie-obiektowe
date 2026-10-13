package lab01;


// Zanim uruchomie program to tutaj go przeanalizuje:
// na starcie mamy x = 2 oraz int wynik = 0
// wykonuje sie petla pierwszy raz: wynik+=2 czyli wynik=2 oraz x*=2 czyli x=4 oraz i=0
// petla wykonuje sie drugi raz: wynik+=4 czyli wynik=6 oraz x*=2 czyli x=8 oraz i=1
// petla wykonuje sie trzeci raz: wynik+=8 czyli wynik=14 oraz x*=2 czyli x=16 oraz i=2
// petla wykonuje sie czwarty raz: wynik+=16 czyli wynik=30 oraz x*=2 czyli x=32 oraz i=3
// koniec bo i=4 a wiec koniec petli
// finalnie wypisze 32 a w kolejnej lini 24


public class Zadanie5 {
    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        System.out.println(x);
        System.out.println(wynik);
    }
}
