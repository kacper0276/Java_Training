class SingletonPrzyklad {
    // Singleton to wzorzec projektowy zapewnia że może powstać jedna instancja danego obiektu (np. dostęp do jednego połączenia do bazy danych)

    // Uzycie zmiennej tylko wewnątrz klasy
    private static SingletonPrzyklad instance;

    // Prywatny konstruktor nie może być wywołany z new
    private SingletonPrzyklad() {}

    public static SingletonPrzyklad getInstance() {
        if (instance == null) {
            instance = new SingletonPrzyklad();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String argsp[]) {
        //Błąd wywołąnia bo konstruktor jest prywatny
        // SingletonPrzyklad singleton = new Singleton();

        SingletonPrzyklad instance1 = SingletonPrzyklad.getInstance();
        SingletonPrzyklad instance2 = SingletonPrzyklad.getInstance();
        System.out.println(instance1 == instance2); // true <- Ta sama instancja
    }
}
