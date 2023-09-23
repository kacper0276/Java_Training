package Kolekcje;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class NewPerson extends Person {
    NewPerson(String name) {
        super(name);
    }

    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) {
            return false;
        }

        NewPerson person = (NewPerson) o;
        return this.name.equals(person.name);
    }

    public int hashCode() {
        // hashCode ma zwrócić ten sam hash
        // dla obu obiektów jeśli taki sam name
        return Objects.hash(name);
    }
}

public class HashSetNauka {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Ford");
        hashSet.add("Opel");
        hashSet.add("Volvo");
        hashSet.add("Ford");
        hashSet.add("Pontiac");
        hashSet.add("Volvo");
        hashSet.add("Dodge");

        // dostępne metody add(), clear(), clone() - same elementy nie sa klonowane
        // contains(), isEmpty, iterator(), remove()
        // HashSet - nie pozwala na ponowne dodanie takiego samego elementu, wszystkie są unikalne
        // Nie zachowuje kolejności elementów, w praktyce jest losowa
        // Kolejnośc jest określana na podstawie unikalnego hasha, przez co jest losowa
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String car = iterator.next();
            System.out.println(car);
        }
        // WAŻNE
        // Obiekty można dodac dwa razy new Person(Adam)
        // Ale jeśli mamy Person p = new Person("Adam") to nie pozwoli dodać

        // Rozwiązanie
        HashSet<NewPerson> hashSet1 = new HashSet<>();
        NewPerson p = new NewPerson("Adam");
        hashSet1.add(p);
        hashSet1.add(new NewPerson("Ola"));
        hashSet1.add(new NewPerson("Rafał"));
        hashSet1.add(p);
        hashSet1.add(new NewPerson("Adam"));
        Iterator<NewPerson> iterator1 = hashSet1.iterator();
        while (iterator1.hasNext()) {
            NewPerson per = iterator1.next();
            System.out.println(per);
        }
    }
}
