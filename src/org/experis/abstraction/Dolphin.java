package org.experis.abstraction;

public class Dolphin extends Animal implements canSwim{

    @Override
    public String toString(){
        System.out.println("(Delfino");
    }

    @Override
    public String sound(){
        System.out.println("Ultrasuono");
    }

    @Override
    public String eat(){
        System.out.println("Pesci");
    }

    @Override
    public void swim(){
        System.out.println("Sto nuotando");
    }

  }
