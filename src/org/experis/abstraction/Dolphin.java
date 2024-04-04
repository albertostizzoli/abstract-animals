package org.experis.abstraction;

public class Dolphin extends Animal implements CanSwim {

    @Override
    public String toString() {
        return "(Delfino)";
    }

    @Override
    public String sound() {
        return "Ultrasuono";
    }

    @Override
    public String eat() {
        return "Pesci";
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando");
    }

}

