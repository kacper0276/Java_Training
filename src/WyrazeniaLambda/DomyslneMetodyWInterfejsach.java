package WyrazeniaLambda;

// Interfejs funkconalny może mieć też metody statyczne i domyślne
// Domyślne to domyślna implementacja interfejsu
@FunctionalInterface
interface MathInterface {
    int operate(int a, int b);

    default int add(int a, int b) {
        return a + b;
    }

    default int substract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

class MathClass implements MathInterface {
    public int operate(int a, int b) {
        return 0;
    }

    // Nadpisanie metody
    public int add(int a, int b) {
        System.out.println("MathClass add");
        return MathInterface.super.add(a, b); // Po super i nazwie interfejsu odwołujemy się do nadrzędnej metody
    }
}

interface Test1 {
    default int method() {
        return 0;
    }
}

interface Test2 {
    default int method() {
        return 0;
    }
}

class DwaTeSameMetody implements Test1, Test2 {
    // By uniknąć błędu kompilacji musimy przesłonić tę metodę
    public int method() {
        return 0;
    }
}

public class DomyslneMetodyWInterfejsach {
    public static void main(String[] args) {
        MathInterface math = (int a, int b) -> a + b;

        System.out.println("Add: " + math.operate(11, 6));
        System.out.println("Add: " + math.operate(20, 5));
        System.out.println("Substract: " + math.substract(100, 70));
        System.out.println("Multiply: " + MathInterface.multiply(15,4));

        MathClass mathClass = new MathClass();
        System.out.println(mathClass.add(100, 100));
        System.out.println(mathClass.substract(300, 150));
    }
}
