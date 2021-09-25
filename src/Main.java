import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        boolean parzysta;
        switch (liczba % 2){
            case 0: parzysta = true;
            break;
            default: parzysta = false;
        }
        if(parzysta){
            System.out.println("Liczba " + liczba + " jest parzysta.");
        }else{
            System.out.println("Liczba " + liczba + " jest nieparzysta.");
        }

        boolean podzielnaPrzez7;
        switch (liczba % 7){
            case 0: podzielnaPrzez7 = true;
                break;
            default: podzielnaPrzez7 = false;
        }

        if(podzielnaPrzez7){
            System.out.println("Liczba " + liczba + " jest podzielna przez 7.");
        }else{
            System.out.println("Liczba " + liczba + " nie jest podzielna przez 7.");
        }

        char[] listaZnakow = {'o', 'p', 'x', 'z', 'q'};
        int iloscPasujacychZnakow = 0;
        int iloscPozostalychZnakow = 0;
        boolean znaleziona = false;

        String slowo = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        for (int i = 0; i < slowo.length(); i++) {
            for (char c:listaZnakow) {
                if (slowo.charAt(i) == c) {
                    znaleziona = true;
                    break;
                }
            }
            if(znaleziona){
                iloscPasujacychZnakow++;
            }else{
                iloscPozostalychZnakow++;
            }
            znaleziona = false;
        }
        System.out.println("Ilość znalezionych znaków = " + iloscPasujacychZnakow);
        System.out.println("Ilość pozostałych znaków = " + iloscPozostalychZnakow);
    }

}
