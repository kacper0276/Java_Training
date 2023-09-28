package Strumienie;

import java.util.Optional;

public class OptionalNauka {
    public static void main(String[] args) {
        // NullPointerException - gdy jest próba wywołania metody na wartości null
        String str[] = new String[3];
        str[0] = "Test";
        // String text = str[1].toUpperCase();

        Optional<String> text = Optional.ofNullable(str[0]); // Null lub nie

        if(text.isPresent()) { // czy nie jest pusty
            System.out.println("Element istnieje: " + text.get().toUpperCase());
        } else {
            System.out.println("Element nie istnieje");
        }

        // ifPresent() - jeżeli nie jest null to wywoła lambde
        text.ifPresent(s -> System.out.println(s));

        String str1 = "Text";
        Optional<String> opt = Optional.of(str1); // Off nie może być null
        System.out.println(opt.get());

        // Pusty optional
        Optional<Integer> opt1 = Optional.empty();

        System.out.println("Optional: " + opt1);

        // Metoda map() - wykona funkcję jeżeli w obiekcie opcjonalnym jest wartość
        // Zwróci Optional który może być pusty

        Integer integer = Integer.valueOf(10);
        Optional<Integer> optInt = Optional.ofNullable(integer);

        Optional<Integer> result = optInt.map(i -> i * 2).map(i -> i * 2);
        System.out.println(result);
        System.out.println(result.get());

        Optional<Integer> optNull = Optional.ofNullable(null);
        Optional<Integer> resultNull = optNull.map(i -> i * 2);
        System.out.println(resultNull);
        System.out.println(resultNull.orElse(12)); // Przy pustym optional zwróci 12
//        System.out.println(resultNull.get());

        // Metoda filter()
        String string = "Ala ma kota";
        Optional<String> optionalString = Optional.ofNullable(string);

        String textString = opt.filter(t -> t.length() > 0)
                .orElse("Domyślny łańcuch znaków");

        System.out.println(textString); // Jak po filtr pusty (Nie spełni warunku) to w textString jest "Domyślny łańcuch znaków"

        // Metoda or()
        String orNaukaStr = " Przykładowy tekst ";
        Optional<String> orOptional = Optional.ofNullable(orNaukaStr);

        String textOrNauka = orOptional.filter(t -> t.length() > 5)
                .or(() -> Optional.ofNullable("Domyślny łańcuch"))
                .map(String::toUpperCase)
                .map(String::trim)
                .orElse("Domyślny łańcuch znaków");

        System.out.println(textOrNauka);
    }
}
