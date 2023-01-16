package it.develhope.polymorphism2;

public class Start {
    public static void main(String[] args){
        Animal animal = new Animal("Generic animal");
        Animal lion = new Lion("Simba");
        Animal cow = new Cow("Carolina");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();

    }
}
