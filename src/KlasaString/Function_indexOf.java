package string_class;

public class Function_indexOf {
    public static void main(String args[]) {

        String str = "Raz dwa trzy cztery";

        int index = str.indexOf("dwa trzy");
        System.out.println("dwa trzy, index: " + index);

        index = str.indexOf("pięć");
        System.out.println("pięć, index: " + index);

        index = str.indexOf("trzy", 10);
        System.out.println("trzy, index: " + index);

    }
}
