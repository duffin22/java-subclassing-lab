package com.hfad.javasubclass;

/**
 * Created by matthewtduffin on 06/07/16.
 */
public class Vulture extends Bird {

    public Vulture(String animalSpecies,String animalID, String animalCall, String animalPicture, int topSpeed, int weight, int wingSpan) {
        super(animalSpecies,animalID,animalCall,animalPicture,topSpeed,weight,wingSpan);
        this.setCanFly(true);
    }

    @Override
    public void makeNoise() {
        System.out.println("I dunno, what d'you wanna do?");
    }

    public void scavenge() {
        System.out.println("The Vulture took your kill!");
    }
}
