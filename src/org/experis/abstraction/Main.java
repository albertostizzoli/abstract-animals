package org.experis.abstraction;

public class Main {
    // Metodo per far volare un animale che può volare
    public void makeFly(CanFly animal){
        animal.fly();
    }

    // Metodo per far nuotare un animale che può nuotare
    public void makeSwim(CanSwim animal){
        animal.swim();
    }


    public static void main(String[] args) {
        // Creo gli oggetti
        Dog dog = new Dog();
        Sparrow sparrow = new Sparrow();
        Eagle eagle = new Eagle();
        Dolphin dolphin = new Dolphin();

        // Creo un array di animali e lo inizializzo con gli oggetti creati precedentemente
        Animal[] animals = {dog, sparrow, eagle, dolphin};

        Main main = new Main(); // Creare un'istanza di Main per chiamare i metodi di istanza
        // con un ciclo for stampo gli animali
        for (int i = 0; i < animals.length; i++) {
            Animal animal = animals[i];
            // Stampo l'animale
            System.out.println(animal);
            //Stampo l'animale che sta dormendo
            System.out.println("Sto dormendo: ");
            animal.sleep();
            // Stampo il verso dell'animale
            System.out.println("Il mio verso è: ");
            animal.sound();
            // Stampo che cosa mangia l'animale
            System.out.println("Mangio: ");
            animal.eat();

            if(animal instanceof CanSwim){ // Controllo se l'animale può nuotare
                main.makeSwim((CanSwim) animal); // Chiamo makeSwim sull'istanza di Main
            } else if (animal instanceof CanFly){ // Controllo se l'animale può volare
                main.makeFly((CanFly) animal); // Chiamo makeFly sull'istanza di Main
            }
            System.out.println("--------");
        }
    }
}




