package string_class;

public class StringsComparison {

    public static void main(String args[]) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELLo";

        if(s2.equals(s1)) System.out.println("s2 równe jest s1");

        if(s3.equals(s1)) System.out.println("s3 równe jest s1"); // false

        if(s1.equalsIgnoreCase(s3)) System.out.println("s1 równe jest s3 - wielkość znaków ignorowana.");


    }

}
