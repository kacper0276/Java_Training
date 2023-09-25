package WyrazeniaLambda;

import java.util.ArrayList;



public class InterfejsyFunkcyjne {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ania");
        arr.add(null);
        arr.add("Kot");
        arr.add("Adam");

        // Wyrażenie lambda przyjmujące argument, element, zwracające true dla Kot
        // Dzięki czemu będą skasowane z ArrayList
        arr.removeIf(e -> e == null || e.equalsIgnoreCase("Kot"));
        System.out.println(arr);
    }
}
