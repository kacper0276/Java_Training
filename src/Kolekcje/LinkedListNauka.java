package Kolekcje;

import java.util.LinkedList;
import java.util.ListIterator;

class Person {
    public String name;

    Person(String name ) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public String toString() {
        return "Imie: " + this.name;
    }
}

public class LinkedListNauka {
    public static void main(String[] args) {
        // Sprawdza się najlepiej przy częstej modyfikacji elementów
        LinkedList list = new LinkedList();
        Person p1 = new Person("Ola");
        list.add(p1);
        list.add(p1);
        list.add(new Person("Zenon"));
        list.addFirst(new Person("Kasia"));
        list.addLast(new Person("Olek"));
        Person p2 = new Person("Daniel");
        list.add(p2);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        list.removeFirstOccurrence(p1); // Usunięcie Ola
        list.removeLastOccurrence(p2); // Usunięcie Daniel

        System.out.println(list);

        System.out.println("Ola index: " + list.indexOf(p1)); // 0
        System.out.println("Ola lastIndex: " + list.lastIndexOf(p1)); // 0

        // Reszta metod: contains(), clear(), addAll(), remove(), size(), get(), set(), toArray()

        // Iterator metody hasNext(), next(), add(), previous(), hasPrevious(), set(), poniewaz to uporządkowana kolekcja
        System.out.println("Iteracja");
        ListIterator<Person> iterator = list.listIterator();
        // ListIterator pozwala dodać nowy element w trakcie iteracji
        iterator.add(new Person("Kazik"));
        iterator.add(new Person("Kuba"));
        iterator.next();
        iterator.add(new Person("Kuba"));
        iterator.next();
        iterator.set(new Person("TEST")); // set zamienia obecny rekord

        System.out.println(list);
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }

        // iteracja od ostatniego elementu do pierwszego
        ListIterator<Person> lastIterator = list.listIterator(list.size()); // Argument określa od którego indeksu ma zacząś się iteracja

        while (lastIterator.hasPrevious()) {
            Person p = lastIterator.previous();
            System.out.println(p);
        }
    }
}
