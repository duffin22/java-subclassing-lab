package com.hfad.javasubclass;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public abstract class Animal {
    private String animalSpecies;
    private String animalID;
    private String animalCall;
    private String animalPicture;
    private int topSpeed;
    private int weight;

    public Animal(String animalSpecies,String animalID, String animalCall, String animalPicture, int topSpeed, int weight) {
        this.animalSpecies=animalSpecies;
        this.animalID=animalID;
        this.animalCall=animalCall;
        this.animalPicture=animalPicture;
        this.setTopSpeed(topSpeed);
        this.setWeight(weight);
    }

    public abstract void makeNoise();

//***** getter and setter methods
    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getAnimalCall() {
        return animalCall;
    }

    public String getAnimalPicture() {
        return animalPicture;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed>0) {
            this.topSpeed = topSpeed;
        } else {
            this.topSpeed=0;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight>0) {
            this.weight = weight;
        } else {
            this.weight = 0;
        }
    }
}
