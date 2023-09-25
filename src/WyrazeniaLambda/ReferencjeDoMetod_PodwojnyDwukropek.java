package WyrazeniaLambda;
//import java.util.function.IntSupplier <- funkcje

// W Java można pobrać referencję do metody za pomocą operatora :: i przypisać ją do zmiennej
// w calu późniejszego wywołania

// Adnotacja upewni się aby interfejs był interfejsem funkcyjnym inaczej zgłosi błąd (tylko jedna metoda abstrakcyjna)
@FunctionalInterface
interface IntSupplier {
    int getAsInt();
}

public class ReferencjeDoMetod_PodwojnyDwukropek {
    public void test(IntSupplier intSupplier) {
        System.out.println(intSupplier.getAsInt());
    }

    public static void main(String[] args) {
        Object obj = new Object();

        // interfejs funkcyjny oraz wyłuskanie metody hashCode
        IntSupplier intSupplier = obj::hashCode;

        // Wyowłanie hashCode w innym miejscu
        int hash = intSupplier.getAsInt();
        System.out.println(hash);

        System.out.println(hash == obj.hashCode());

        ReferencjeDoMetod_PodwojnyDwukropek metodPodwojnyDwukropek = new ReferencjeDoMetod_PodwojnyDwukropek();
        metodPodwojnyDwukropek.test(intSupplier);
    }
}
