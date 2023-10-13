package string_class;

public class Functions_replaceAll_replaceFirst {
    public static void main(String args[]) {

        String str = "Jan Kowalski Kasia Kowalska";
        String str1 = str.replaceAll("Kowalska", "Zawadzka");
        System.out.println(str1); // Jan Kowalski Kasia Zawadzka

        String str2 = str1.replaceFirst(" ", " Junior ");
        System.out.println(str2); // Jan Junior Kowalski Kasia Zawadzka

    }
}
