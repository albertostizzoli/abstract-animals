package org.experis.abstraction;

public class Sparrow extends Animal{

    @Override
    public String toString(){
        System.out.println("(Passerotto)");
    }

    @Override
    public String sound(){
        System.out.println("Cinguettio");
    }

    @Override
    public String eat(){
        System.out.println("Semi");
    }
}
