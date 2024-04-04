package org.experis.abstraction;

public class Dolphin extends Animal implements CanSwim {

    @Override
    public String toString() {
        return "DELFINO";
    }

    @Override
    public void sound() {
        System.out.println("Glu Glu");
    }

    @Override
    public void eat() {
        System.out.println("Pesci");
    }

    @Override
    public void swim() {
        System.out.println("Sto nuotando");
    }

}

