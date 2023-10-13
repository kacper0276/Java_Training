package types.test;


class Employee {
    protected int salary;
    protected String name;
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public void printName() {
        System.out.println("Employee: "+name+", salary: "+salary);
    }
}

class Manager extends Employee {
    public Manager(String name, int salary){
        super(name, salary);
    }
    public void printName() {
        System.out.println("Manager: "+name +", salary:"+salary);
    }
    public void giveRise(Employee employee, float percent) {
        employee.salary += (int)(employee.salary * percent);
    }
}




public class Company {
    public static void main(String args[]) {
        Employee employees[] = new Employee[10];
        employees[0] = new Manager("Dyrektor", 10000);
        employees[1] = new Employee("Programista", 12000);

        if(employees[0] instanceof Manager) {
            Manager manager = (Manager) employees[0];
            manager.giveRise( employees[1], 0.05f ); // działa!
        }

        employees[1].printName(); // Employee: Programista, salary: 12600
    }
}