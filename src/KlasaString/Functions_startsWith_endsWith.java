package string_class;

public class Functions_startsWith_endsWith {
    public static void main(String args[]) {

        String str = "Java program";

        if(str.startsWith("PHP")) System.out.println("Starts with PHP");

        if(str.startsWith("Java")) System.out.println("Starts with Java");

        if(str.endsWith("program")) System.out.println("Ends with program");
    }
}
