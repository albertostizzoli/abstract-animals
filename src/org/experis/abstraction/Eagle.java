package org.experis.abstraction;

public class Eagle extends Animal{

    @Override
    public String toString() {
        System.out.println("(Aquila)");
    }

    @Override
    public String sound(){
        System.out.println("Stridio");
    }

    @Override
    public String eat(){
        System.out.println("Piccoli Animali");
    }

}
