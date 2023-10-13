package string_class;

public class Functions_trim_stripLeading_stripTrailing {
    public static void main(String args[]) {

        String str = "   \n \n  Hello World!       \n  ";
        String str2 = str.trim();
        System.out.println( "\"" + str2 + "\"" );

        String str3 = str.stripLeading();
        System.out.println( "\"" + str3 + "\"" );

        String str4 = str.stripTrailing();
        System.out.println( "\"" + str4 + "\"" );

    }
}
