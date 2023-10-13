package types;

public class J06_wrapperClasses {
    public static void main(String args[]) {
        int a = 123;
        Integer number = Integer.valueOf(a);
        System.out.println( number.toString() );
        System.out.println( number.floatValue() );
        System.out.println( Integer.toHexString(a) );
    }
}
