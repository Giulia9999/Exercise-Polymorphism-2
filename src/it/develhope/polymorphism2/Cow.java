package it.develhope.polymorphism2;

/**
 * This is a subclass of Animal class
 */
public class Cow extends Animal{
    /**
     * Usage of Animal constructor method
     * @param animalName "The name of the lion
     */
    public Cow(String animalName) {
        super(animalName);
    }
    /**
     * Method override of animalSound()
     */
    @Override
    public void animalSound() {
        System.out.println("Moo");
    }
}
