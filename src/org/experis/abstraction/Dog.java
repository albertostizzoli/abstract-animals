package org.experis.abstraction;

public class Dog extends Animal {

    @Override
    public String toString() {
        return "CANE";
    }

    @Override
    public void sound() {
        System.out.println("Bau Bau");
    }

    @Override
    public void eat() {
        System.out.println("Croccantini");
    }

}

