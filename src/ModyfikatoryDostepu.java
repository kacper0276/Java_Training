class Maszyna {
    public String type;
    public float topSpeed;

    Maszyna() {
        type = "basic";
    }

    private void printInfo() {
        System.out.println("Type: " + this.type + " topSpeed: " + this.topSpeed);
    }
}

class Cars extends Maszyna {
    Cars() {
        type = "car";
        topSpeed = 200.0f;
    }
}

// Jeżeli bazowa klasa ma pole lub metodę private to klasa pochodna nie będzie miała do nich dostepu
// Jeżeli protected to pola i metody będą dostepne dla klas dziedziczących, też będą widoczne dla klas w tym samym pakiecie
// Jeżeli rozszerzymy klasę z polem protected ale w innym pakiecie to mamy dostep do pól i metod protected ale tylko w tej klasie która rozszerza
// Jeżeli public to z każdego pakietu (raczej dla metod)
// Jeżeli brak modyfikatora to dzaiała jak protectedm czyli inne klasy z tego samego obiektu mają dostep do elementów klasy oznaczone protected,
// jedyna różnica względem protected rozszerająca klasa z innego pakietu nie ma dostępu do pola nadklasy bez modyfikatora

public class ModyfikatoryDostepu {

}
