package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Imie: " + this.name + " Wiek: " + this.age;
    }
}

public class KolekcjeWstęp {
    public static void main(String[] args) {
        System.out.println("Podstawy");
        String str1 =  "Ania";
        String str2 = "Kacper";
        String str3 = "Przykład";
        // ArrayList arrayList = new ArrayList();
        // Lub
        ArrayList<String> arrayList = new <String>ArrayList();
        arrayList.add(str1);
        arrayList.add(str2);
        arrayList.add(str3);

        System.out.println(arrayList);
        // Sortowanie
        Collections.sort(arrayList);

        System.out.println(arrayList);

        arrayList.remove(2);
        System.out.println(arrayList);

        // Bazują na obiekt co wymusza rzutowanie
        // Object obj = arrayList.get(1); // Zwraca Object jeśli użyjemy tego ArrayList arrayList = new ArrayList();
        //String name = (String) obj;
        String name = arrayList.get(0);
        System.out.println(name);


        System.out.println("Własna klasa");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ola", 30));
        Employee employee = new Employee("Daniel", 30);
        employees.add(employee);
        employees.add(employee);

        // Zmiana elementu pod określonym indeksem, nadpisuje element
        employees.set(2, new Employee("Rafał", 32));

        // Dodaje element pod indeksem, przesuwa resztę dalej
        employees.add(0, new Employee("Kacper", 25));

        for(Employee e: employees) {
            System.out.println(e.toString());
        }

        System.out.println("Typy proste");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(98);
        numbers.add(Integer.valueOf(78));
        numbers.add(12);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
