import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PodstawyJava {
    public static void main(String[] args) throws IOException {
        int number = 24;
        number = 100;

        System.out.println("Hello World: " + number);

        // 1 bajt = 8 bitów, wartość z zakresu -128 do 127
        byte smallNum = 12;

        // 2 bajty = 16 bitów wartość od -32768 do 32767
        short num2b = 32000;

        // 4 bajty = 32 bity
        int num = -2302;

        // 8 bajtów = 64 bity
        long bigNum = 998293L; // Wymagane jest L aby wskazać typ literału

        // float 4 bajt = 32 bity, około 6-7 cyfr po przecinku
        float smallFloat = 34.5f;

        // 8 bajtów = 64 bity, 15 cyfr po przecinku
        double doubleNum = 123.876d;

        boolean flag = true;

        char sign = '\u0041';
        System.out.println(sign);

        // Typy proste mają odpowiedniki w typach złożonych (Dodatkowe funkcje itp)
        // byte - Byte, short - Short, int - Integer, long - Long, float - Float, double - Double, char - Char, boolean - Boolean

        Integer objI = Integer.valueOf(98);
        objI.toString(); // Zamiana na string

        // Nie używać lepiej
        Integer otherI = new Integer(32);

        Integer result = objI + otherI;
        System.out.println("Result: " + result);
        System.out.println(Integer.toHexString(result));

        // Od Javy 10 - typ var (Użycie tylko lokalnie)
        System.out.println(add(10, "15"));

        // Final - const (Stała wartość)
        final int staticNum = 15;

        // String
        String s1 = "Ola ma ";
        String s2 = new String("Kota"); // Konstruktor
        s1 = s1 + s2;
        System.out.println(s1);

        // Odczytanie danych z konsoli
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imię:");
        String name = reader.readLine();
        System.out.println("Twoje imię to: " + name);

        // Literały to napis w programie który reprezentuje bezpośrednio wartość danych

        // Tablice
        int array[];
        array = new int[8]; // alokacja pamięci na 8 elementów typu int

        String strArr[] = new String[7];

        int arr[] = {1, 2, 3};
        System.out.println(arr[2]);

        String arStr[] = {"AAA", "BBB"};
        System.out.println(arStr[0]);

        String muliArr [][] = {{ "One", "Two", "Three"}, {"Four", "Five", "Six"}};
        System.out.println(muliArr[0][1]);

        // Typ wyliczeniowy
        ShirtSize buyerShirtSize = ShirtSize.M;
        buyerShirtSize = ShirtSize.S;
        System.out.println(buyerShirtSize);
    }
    // Od Javy 10 - typ var
    public static int add(int num1, String num2) {
        var res = num1 + Integer.valueOf(num2).intValue();
        return res;
    }

    enum ShirtSize {S, M, L, XL};

}