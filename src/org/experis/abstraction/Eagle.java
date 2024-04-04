package org.experis.abstraction;

public class Eagle extends Animal implements CanFly {

    @Override
    public String toString() {
        return "(Aquila)";
    }

    @Override
    public String sound() {
        return "Stridio";
    }

    @Override
    public String eat() {
        return "Piccoli Animali";
    }

    @Override
    public String fly() {
        return "Sto volando";
    }

}

