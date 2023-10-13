package string_class;
public class StringBuilderExample {
    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder();
        builder.append("Ola ma kota.").append(123);
        builder.append(" Kolejny tekst");

        builder.insert(0, "Kasia ma psa. ");

        System.out.println(builder.toString()); // Kasia ma psa. Ola ma kota.123 Kolejny tekst

        builder.replace(0, 5, "Julia");
        System.out.println(builder.toString()); // Julia ma psa. Ola ma kota.123 Kolejny tekst

        builder.insert(12, " oraz kota");
        System.out.println(builder.toString()); // Julia ma psa oraz kota. Ola ma kota.123 Kolejny tekst

        int index = builder.indexOf("123");
        builder.delete(index, builder.length());
        System.out.println(builder.toString()); // Julia ma psa oraz kota. Ola ma kota.
    }
}
