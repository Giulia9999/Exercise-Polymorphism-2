package it.develhope.polymorphism2;

public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("default animal sound");
    }
}
