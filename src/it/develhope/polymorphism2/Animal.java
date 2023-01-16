package it.develhope.polymorphism2;

/**
 * This is thr superclass of Lion and Cow classes.
 */
public class Animal {
    private String animalName;

    /**
     * Constructor of the Animal class
     * @param animalName The name of the animal
     */
    public Animal(String animalName){
        this.animalName = animalName;
    }

    /**
     * Define the AnimalSound() method
     */
    public void animalSound(){
        System.out.println("default animal sound");
    }
}
