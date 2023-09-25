package ProgramowanieGeneryczne;

// Jest to odpowiednik szablonów dla klas i metod
class Point<T> { // klasa generyczna (typ generyczny T)
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {return x;}
    public void setX(T x) {this.x = x;}
    public T getY() {return y;}
    public void setY(T y) {this.y = y;}

    public String toString() {
        return "Point{ " + "x=" + x + " y=" + y + " }";
    }
}

// Trzy typy generyczne
class Trio<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Trio(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printTrio() {
        System.out.println(this.first + " - " + this.second + " - " + this.third);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public V getThird() {
        return third;
    }

    public void setThird(V third) {
        this.third = third;
    }
}
public class WstepProgramowanieGeneryczne {
    public static void main(String[] args) {
        Point<Integer> pointInt = new Point<Integer>(10, 20);
        pointInt.setX(12);
        System.out.println(pointInt.toString());

        Trio<Integer, Float, String> trio = new Trio<>(12, 10.5f, "Tekst");
        trio.printTrio();
    }
}
