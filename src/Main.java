import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numerIndeksu = 57680;
        for (int i = 100; i <= 0; i--) {
            if (i % 80 == 0){
                System.out.println("Liczba " + i + " jest podzielna przez 80.");
            }
        }

        Scanner scanner = new Scanner(System.in);
        int[] tablicaInt = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj liczbę nr " + (i+1));
            tablicaInt[i] = scanner.nextInt();
        }
        for (int element : tablicaInt) {
            System.out.println(element+11);
        }
    }
}
