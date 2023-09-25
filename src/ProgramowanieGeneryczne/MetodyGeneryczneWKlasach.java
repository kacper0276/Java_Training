package ProgramowanieGeneryczne;

import java.util.ArrayList;

class Util {
    public static <E> void printData(ArrayList<E> list) {
        for(int i = 0; i < list.size(); i++) {
            E element = list.get(i);
            System.out.println(element);
        }
    }
}

public class MetodyGeneryczneWKlasach {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ford");
        arr.add("Opel");
        arr.add("GMC");
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(50);
        arr1.add(40);
        arr1.add(19);

        Util.printData(arr);
        Util.printData(arr1);
    }
}
