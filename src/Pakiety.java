import java.util.*;

// Jeśli są w tym samym pakiecie nie trzeba importować

public class Pakiety {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imię");
        String name = in.nextLine();

        System.out.println("Twoje imię to: "+ name);

        // Ten sam folder bez importu
        KlasaMath a = new KlasaMath();

        // Wywołanie main innej klasy bez importu bo static
        KlasaMath.main(null);

    }
}
