package org.experis.abstraction;

public class Dog extends Animal {

    @Override
    public String toString() {
        return "(Cane)";
    }

    @Override
    public String sound() {
        return "Abbaia";
    }

    @Override
    public String eat() {
        return "Carne";
    }

}

