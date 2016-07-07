package com.hfad.javasubclass;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public class Ostrich extends Bird {

    public Ostrich(String animalSpecies,String animalID, String animalCall, String animalPicture, int topSpeed, int weight, int wingSpan) {
        super("Ostrich",animalID,"Chirp! Chirp!",animalPicture,topSpeed,weight,wingSpan);
        this.setCanFly(false);
    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp, Chirp!");
    }

    public void buryHead() {
        System.out.println("The Ostrich buried its head in the sand");
    }
}
