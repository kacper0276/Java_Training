package WyrazeniaLambda;

import java.util.Arrays;

// Interfejsy funkcyjne, są często wykorzysywane przez wiele metod klas Java, wystarczy jeśli mają jedną metodę abstrakcyjną, wtedy
// są zgodne z wyrażeniem lambda
public class LambdaWArraySord {
    public static void main(String[] args) {
        String strArr[] = {"Klementyna", "Ania", "Zuzanna", "Modesta", "Kasia", "Ola"};

        // Metoda sort z Arrays przyjmuje interfejs Comparator jako drugi argument
        // posiada abstrakcyjną metode compare, której wywołanie spowoduje użycie wyrażenia lambda
        Arrays.sort(strArr, (first, second) -> first.length() - second.length());

        for(String s: strArr) {
            System.out.println(s);
        }
    }
}
