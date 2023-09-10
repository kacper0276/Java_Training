import java.math.BigInteger;
import java.math.BigDecimal;

public class KlasaMath {
    public static void main(String[] args) {
        double sqrt = Math.sqrt(4);
        System.out.println(sqrt);

        double power = Math.pow(2, 3);
        System.out.println(power);

        double random = Math.random(); // Zwraca od 0 do 1

        BigInteger num = BigInteger.valueOf(841023719837L); // Liczba typu long
        BigInteger num2 = new BigInteger("4971293872198472198416249"); // W postaci stringa

        // add, substract, divide, multiply, sqrt itd
        num2 = num2.add(new BigInteger("4812938192318723981"));
        System.out.println(num2.toString());

        // BigDecimal działa podobnie reprezentuje duże liczby rzeczywiste

        // Konwersje typów - jawne i niejawne
        int i = 10;
        double b = 10 / (double)i; // Jawna, niejawna jak nie damy (double)
    }
}
