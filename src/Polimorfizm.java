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

    public void funForSec() {
        System.out.println("DWA");
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

// Rzutowanie między referencją jednej klasy na referencję innej
// Konwersję taką robi się, gdy został zgubiony typ danej zmiennej

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

        MainClass mainArray[] = new MainClass[10];
        mainArray[0] = new SecondClass("dwa");
        mainArray[0].printInfo();
        mainArray[1] = new MainClass("Main");
        mainArray[1].printInfo();

        // Zgubiony typ
        // mainArray[0].funForSec();

        // Rzutowanie
        if(mainArray[0] instanceof SecondClass) {
            SecondClass sec = (SecondClass) mainArray[0];
            sec.funForSec();
        }


//        Błąd
//        ThirdClass errorType = new MainClass("ASD");
    }
}
