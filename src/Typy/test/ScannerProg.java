package types.test;

import java.util.Scanner;

// odczytanei danych od użytkownika z konsoli
public class ScannerProg {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imię.");
        String name = in.nextLine();
        System.out.println("Skąd jesteś?");
        String city = in.nextLine();

        System.out.println("Nazywasz się " + name
               + " i jesteś z miasta: " + city);
    }
}
