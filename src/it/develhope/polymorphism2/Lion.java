package it.develhope.polymorphism2;

/**
 * This is a subclass of Animal class
 */
public class Lion extends Animal{


    /**
     * Usage of Animal constructor method
     * @param animalName "The name of the lion
     */
    public Lion(String animalName) {
        super(animalName);
    }

    /**
     * Method override of animalSound()
     */
    @Override
    public void animalSound() {
        System.out.println("Roarr");
    }
}
