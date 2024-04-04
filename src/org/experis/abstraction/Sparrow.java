package org.experis.abstraction;

public class Sparrow extends Animal implements CanFly {

    @Override
    public String toString() {
        return "(Passerotto)";
    }

    @Override
    public String sound() {
        return "Cinguettio";
    }

    @Override
    public String eat() {
        return "Semi";
    }

    @Override
    public String fly() {
        return "Sto volando";
    }
}

