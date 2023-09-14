class Auto {
    protected String type;
    protected float topSpeed;

    Auto() {
        type = "basic";
    }

    Auto(String type, float topSpeed) {
        this.type = type;
        this.topSpeed = topSpeed;
    }

    protected void printInfo() {
        System.out.println("Type: " + this.type + " topSpeed: " + this.topSpeed);
    }
}

class ExtAuto extends Auto {
    ExtAuto(float topSpeed) {
        // Wywołanie konstruktora klasy bazowej
        super("ExtAuto", topSpeed);

//        super(); <- konstruktor klasy Auto bezargumentowy
    }

    protected void printInfo() {
        // Wywołuje nadrzędną metodę
        super.printInfo();
        System.out.println("Printinfo() from ExtAuto");
    }
}

// Super = dostęp do nadrzędnych właściwości klasy bazowej w klasie dziedziczącej

public class ModyfikatorSuper {
    public static void main(String[] args) {
        ExtAuto car = new ExtAuto(220.0f);
        car.printInfo();
    }
}
