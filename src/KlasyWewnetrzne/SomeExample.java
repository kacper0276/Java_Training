package KlasyWewnetrzne;

// Klasa prywatna zdefiniowana wewnątrz klasy może byc użyta tylko w tej klasie, nigdy poza nią
class TestPrywatna {
    private class PrivClass {
        public void printInfo() {
            System.out.println("Info z PrivClass");
        }
    }

    public class PubClass {
        public void printInfo() {
            System.out.println("Public Class Info");
        }
    }

    public void run() {
        PrivClass obj = new PrivClass();
        obj.printInfo();
    }
}

public class SomeExample {
    private class InnerClass {
        public void printInfo() {
            System.out.println("Info from InnerClass!");
        }
    }

    public void run() {
        InnerClass obj = new InnerClass();
        obj.printInfo();
    }

    public static void main(String[] args) {
        SomeExample obj = new SomeExample();
        obj.run();

        TestPrywatna obj1 = new TestPrywatna();
        obj1.run();

        TestPrywatna.PubClass obj2 = obj1.new PubClass();
        obj2.printInfo();
    }
}
