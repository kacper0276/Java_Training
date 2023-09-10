class Employee {
    String name;
    String surname;
    String jobTitle;

    public Employee(String name, String surname, String jobTitle) {
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
        // this(); <- wywołanie kostruktora bezargumentowego
    }

    public Employee() {
        this.name = "undefined";
        this.surname = "undefined";
        this.jobTitle = "undefined";
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " JobTitle: " + this.jobTitle );
    }

    public Employee getEmployee() {
        return this;
    }
}

class MyMath {
    // Przeciązanie metody (3 metody inne typy)
    static int sum(int x, int y) {
        return x + y;
    }

    static float sum(float x, float y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}

class PoleStatic {
    // Wspolny id dla wszystkich obiektów klay
    static int nextId = 1;

    // Unikalny id dla każdego obiektu
    int id;

    // Final i static
    final static double PI = 3.14159265358;

    // Statyczne metody - niedziała na obiekcie, przykład to metoda Math.pow(x,a) (nie trzeba tworzyć obiektu)
    static int genNextId() {
        return nextId++;
    }

    PoleStatic() {
        id = PoleStatic.genNextId();
    }

    // Każdy program zaczyna się od wywołania statycznej metody main
//    public static void main(String args[]) {
//
//    }
}

public class ProgramowanieObiektowe {
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("IMIE", "Nazwisko", "TEST");
        employee1.printInfo();

        Employee employee2 = new Employee();
        employee2.printInfo();

        // Metoda
        // public - publiczna metoda (private, protected)
        // static - określa że metoda może być wywołana bez tworzenia obiektu

        System.out.println(MyMath.sum(1, 2));

        // this - używamy by odwołać się do obecnej instancji obiektu
        // final double PI - 3.14159d; <- to samo co const (Działa też na obiekty)
        // W obiektach nie możemy zmienić referencji ale możemy zmienić wartość np pt1.x = 7 działa

        PoleStatic p1 = new PoleStatic();
        PoleStatic p2 = new PoleStatic();

        System.out.println(p1.id);
        System.out.println(p2.id);

        System.out.println("Zmienna final static " + PoleStatic.PI);
    }
}
