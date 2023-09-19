import javax.swing.*;

class Point  {
    public int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point {" + "x = " + x + ", y = " + y + "}";
    }
}

// extends Object jest domyślne
public class KlasaObject{
    Object strObj = new String("Test");
    Object interegObj = Integer.valueOf(12);
    Object frame = new JFrame();

    // Wynik różne referencje do obiektów
//    if(frame.equals(interegObj)) {
//        System.out.println("Taka sama referencja do obietków");
//    } else {
//        System.out.println("Różne referencje do obiektów");
//    }

//    Object obj = new Object();
//    // obliczenie indywidualnego hash dla obiektu
//    System.out.println(obj.hashCode()); // Jest domyślnie wykonywana gdy np. do System.out wrzucimy objekt
//    Object obj2 = new Object();
//    System.out.println(obj2.hashCode());
//
//    Point point = new Point(10, 15);
//    System.out.println(point.toString());
}
