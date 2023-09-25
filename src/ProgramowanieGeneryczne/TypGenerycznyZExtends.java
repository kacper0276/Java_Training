package ProgramowanieGeneryczne;

import java.util.ArrayList;

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee{" + " name='" + name + '\'' + '}';
    }
}

class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
}

class Organisation <T extends Person> { // To co będzie podstawione jako T musi rozszerzać klasę Person (Warunek musi być spełniony)
    private ArrayList<T> participants;

    public Organisation(int num) {
        participants = new ArrayList<T>();
    }
    public boolean addParticipant(T participant) {
        return participants.add(participant);
    }

    public T getParticipant(int index) {
        if(index >= 0 && index < participants.size()) {
            return participants.get(index);
        } else {
            return null;
        }
    }
}

public class TypGenerycznyZExtends {
    public static void main(String[] args) {
        Organisation<Employee> o = new Organisation<>(10);
        o.addParticipant(new Employee("Daniel"));
        o.addParticipant(new Employee("Ola"));

        System.out.println(o.getParticipant(0));
    }
}
