package Kolekcje;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteracja {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ola", 30));
        Employee employee = new Employee("Daniel", 30);
        employees.add(employee);
        employees.add(employee);

        // Zmiana elementu pod określonym indeksem, nadpisuje element
        employees.set(2, new Employee("Rafał", 32));

        // Dodaje element pod indeksem, przesuwa resztę dalej
        employees.add(0, new Employee("Kacper", 25));

        // Foreach
        System.out.println("Foreach");
        for(Employee e: employees) {
            System.out.println(e.toString());
        }

        System.out.println("For");
        for(int i = 0; i < employees.size(); i++) {
            Employee el = employees.get(i);
            System.out.println(el);
        }

        System.out.println("Iterator");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            System.out.println(e);
        }
    }
}
