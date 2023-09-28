package OperacjeNaPlikach;

import java.util.Scanner;

public class ScannerNauka {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");
        int num1 = in.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int num2 = in.nextInt();

        System.out.println("Podaj imię:");
        String name = in.next();

        System.out.println("Witaj: " + name + " Suma to: " + (num1 + num2));
    }
}
