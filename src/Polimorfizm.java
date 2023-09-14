// Polimorfizm to przybieranie różnych form przez obiekt w ramach wspólnego mianownika

class MainClass {
    public String name;
    public MainClass() {}
    public MainClass(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Main");
    }
}

class SecondClass extends MainClass {
    public int range;
    public SecondClass(String name) {
        super(name);
    }

    public void printInfo() {
        System.out.println("Second");
    }
}

class ThirdClass extends SecondClass {
    boolean sonicSpeed;

    public ThirdClass(String name) {
        super(name);
    }

    public void printInfo() {
        System.out.println("Third");
    }
}

public class Polimorfizm {
    public static void main(String[] args) {
        // Do obiektu z klasy MainClass przypisano SecondClass
        // Jest to zgodne ze względu na polimorfizm
        MainClass mainclass = new SecondClass("second");
        System.out.println(mainclass.name);
        MainClass thirdClass = new ThirdClass("Third");
        System.out.println(thirdClass.name);

        mainclass.printInfo();
        thirdClass.printInfo();

//        Błąd
//        ThirdClass errorType = new MainClass("ASD");
    }
}
