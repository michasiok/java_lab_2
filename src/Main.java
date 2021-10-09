import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tablicaInt = new int[20];
        tablicaInt = uzupelnijTablice(tablicaInt);
        wypiszWartosci(tablicaInt);


        String[] tablicaString = new String[6];
        tablicaString = uzupelnijZKlawiatury(tablicaString);
        wyswietlOdKonca(tablicaString);


        wyswietlDane("Michał");
        wyswietlDane("Michał", "Kostyk");
        wyswietlDane("Michał", "Kostyk", 25);


        int zmiennaA = suma(1,2);
        int zmiennaB = suma(7,8,9);
        System.out.println("wynik: " + (suma(8,9) + suma(2,3,4)));
    }
    private static int[] uzupelnijTablice(int[] tablicaInt){
        int wartosc = 40;
        for (int i = 0; i < tablicaInt.length ; i++) {
            tablicaInt[i] = wartosc--;
        }
        return tablicaInt;
    }

    private static void wypiszWartosci(int[] tablicaInt){
        for (int element : tablicaInt) {
            System.out.println(element);
        }
    }

    private static String[] uzupelnijZKlawiatury(String[] tablicaString){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tablicaString.length; i++) {
            System.out.print("Podaj wartość " + (i+1) + ": ");
            tablicaString[i] = scanner.next();
        }
        return tablicaString;
    }

    private static void wyswietlOdKonca(String[] tablicaString){
        for (int i = tablicaString.length - 1; i >=0 ; i--) {
            System.out.println(tablicaString[i]);
        }
    }

    private static void wyswietlDane(String imie){
        System.out.println(imie);
    }

    private static void wyswietlDane(String imie, String nazwisko){
        System.out.println(imie + " " + nazwisko);
    }

    private static void wyswietlDane(String imie, String nazwisko, int wiek){
        System.out.println(imie + " " + nazwisko + " " + wiek);
    }

    private static int suma(int a, int b){
        return a+b;
    }

    private static int suma(int a, int b, int c){
        return a+b+c;
    }


}
