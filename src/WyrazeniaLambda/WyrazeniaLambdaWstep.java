package WyrazeniaLambda;
// Są blokami kodu które można przupisać do zmiennej i przekazywać między różnymi częściami programu jako argument
// Do późniejszego wykorzystania.

interface Addition {
    int add(int a, int b); // Metoda abstrakcyjna
}

// Interfejs funkcyjny
interface Substraction <T> {
    T substract(T a, T b);
}

public class WyrazeniaLambdaWstep {
    public static void main(String[] args) {
        // Wyrażenie labmda jest przypisane pod zmienną addition na bazie interfejsu Addition
        Addition addition = (int a, int b) -> a + b; // Lambda określa działanie metody, ale bez nazwy

        int result = addition.add(10, 5);
        System.out.println(result);

        Substraction<Integer> sub1 = (Integer a, Integer b) -> {
            int v = a - b;
            return v;
        };

        int subResult = sub1.substract(30, 8);
        System.out.println(subResult);
    }
}
