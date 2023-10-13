package string_class;

public class Functions_repeat_join_concat {
    public static void main(String args[]) {

        String str = "Info";
        str = str.repeat(3);
        System.out.println(str); // InfoInfoInfo

        String joinedText = String.join(" - ", "Raz", "Dwa", "Trzy");
        System.out.println(joinedText); // Raz - Dwa - Trzy

        String text = "Ola ".concat("ma") + " kota".concat(".");
        System.out.println(text); // Ola ma kota.

    }
}
