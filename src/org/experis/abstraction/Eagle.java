package org.experis.abstraction;

public class Eagle extends Animal implements CanFly {

    @Override
    public String toString() {
        return "AQUILA";
    }

    @Override
    public void sound() {
        System.out.println("Stridio");
    }

    @Override
    public void eat() {
        System.out.println("Piccoli Animali");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }

}

