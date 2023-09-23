package Kolekcje;

import java.util.Comparator;
import java.util.TreeSet;

class AnimalElement {
    private String name;

    public AnimalElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }
}

class AnimalElementComparator implements Comparator<AnimalElement> {
    public int compare(AnimalElement o1, AnimalElement o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TreeSetComparator {
    public static void main(String[] args) {
        TreeSet<AnimalElement> animalElements = new TreeSet<>(new AnimalElementComparator());
        animalElements.add(new AnimalElement("Tiger"));
        animalElements.add(new AnimalElement("Lion"));
        animalElements.add(new AnimalElement("Tiger"));
        animalElements.add(new AnimalElement("Dog"));

        System.out.println(animalElements);
    }
}
