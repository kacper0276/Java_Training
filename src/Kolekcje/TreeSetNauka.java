package Kolekcje;

import java.util.Comparator;
import java.util.TreeSet;

// Jest klasą podobną do HashSet ale ma jedną zaletę, zbiór ten jest uporządkowany, gdyż elementy są przechowywane w strukturze drzewiastej.
// Są posortowane rosnąco. Wadą jest że dodanie elementu jest trochę wolniejsze

// Porównywanie el w zbiorze np. klas - Comparator
class MyComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        String aStr, bStr;
        aStr = a.getName();
        bStr = b.getName();

        return aStr.compareTo(bStr);
    }
}
public class TreeSetNauka {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Kasia");
        treeSet.add("Ola");
        treeSet.add("Daniel");
        treeSet.add("Ania");
        System.out.println(treeSet);

        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(99);
        treeSet1.add(76);
        treeSet1.add(32);
        treeSet1.add(68);
        treeSet1.add(99);
        System.out.println(treeSet1);

        TreeSet<Person> treeSet2 = new TreeSet<>(new MyComparator());
        treeSet2.add(new Person("Ola"));
        treeSet2.add(new Person("Zuza"));
        System.out.println(treeSet2);

        // dostępne metody add(), addAll(), clear(), clone() - same elementy nie sa klonowane
        // contains(), first(), isEmpty(), iterator(), last(), size()
    }
}
