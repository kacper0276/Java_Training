public class WyjatkiJava {
    // Okreslamy jaki błąd może zwrócić ta metoda
    public int divide(int number, int divisior) throws WlasnyWyjatek {
        if(1 == 1) throw new WlasnyWyjatek();
        return number/divisior;
    }

    public static void main(String[] args) {
        int numArr[] = {0, 1, 2, 3, 4, 5};
        // Bez bloku try catch program się wywala, a tak leci dalej
        try {
//            int number = numArr[10];
//            int result = 25 / numArr[0];

            // Wyrzucanie błedu
            // if(numArr[0] == 0) throw new ArithmeticException();

            WyjatkiJava math = new WyjatkiJava();
            int resultMath = math.divide(20, 0);

        } catch (WlasnyWyjatek exception) {
            System.out.println("Własny wyjątek");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error occurred");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception");
            e.printStackTrace(); // Podaje dodatkowa informacje o wyjątku jak klase, metode oraz konkretkna linie w programie
        } catch (Exception e) {
            System.out.println("Bazowa klasa zdarzeń");
        } finally {
            // Finally jest wykonywane zawsze, niezależnie czy jest błąd czy nie
            System.out.println("Finally block executes");
        }
        System.out.println("After error program continues");
    }
}
