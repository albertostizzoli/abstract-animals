package org.experis.abstraction;

public class Sparrow extends Animal implements CanFly {

    @Override
    public String toString() {
        return "PASSEROTTO";
    }

    @Override
    public void sound() {
        System.out.println("Cip Cip");
    }

    @Override
    public void eat() {
        System.out.println("Semi");
    }

    @Override
    public void fly() {
        System.out.println("Sto volando");
    }
}

