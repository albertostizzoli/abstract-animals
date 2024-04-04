package org.experis.abstraction;

public class Dog extends Animal{

    @Override
    public String toString(){
        System.out.println("(Cane");
    }
    @Override
    public String sound(){
        System.out.println("Abbaia");
    }

    @Override
    public String eat(){
        System.out.println("Carne");
    }

}
