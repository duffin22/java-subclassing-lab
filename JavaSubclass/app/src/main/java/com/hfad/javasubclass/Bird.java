package com.hfad.javasubclass;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public abstract class Bird extends Animal {

    private int wingSpan;
    private boolean canFly;

    public Bird(String animalSpecies,String animalID, String animalCall, String animalPicture, int topSpeed, int weight, int wingSpan) {
        super(animalSpecies,animalID,animalCall,animalPicture,topSpeed, weight);
        this.setWingSpan(wingSpan);
    }

    public void layEgg() {
        System.out.println("The "+this.getAnimalSpecies()+" laid an egg.");
    }

//***** getter and setter methods

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        if (wingSpan>0) {
            this.wingSpan = wingSpan;
        } else {
            this.wingSpan = 0;
        }
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
