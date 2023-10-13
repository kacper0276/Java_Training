package string_class;

public class Functions_toCharArray_split_toString {
    public static void main(String args[]) {

        String str = "Ola ma kota";

        char arr[] = str.toCharArray();
        System.out.println("Liczba znaków: " + arr.length); // 11

        String strArr[] = str.split(" ");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String s = str.toString();
        System.out.println(s); // Ola ma kota

        System.out.println(strArr.toString()); // [Ljava.lang.String;@7f690630

        Integer i = new Integer(123);
        System.out.println(i.toString()); // 123

        String text = "Liczba: " + i;
        System.out.println(text); // Liczba: 123


    }
}
