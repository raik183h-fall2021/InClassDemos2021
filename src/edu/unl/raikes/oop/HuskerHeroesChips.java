package edu.unl.raikes.oop;

public class HuskerHeroesChips extends HuskerHeroesFood{

    public HuskerHeroesChips(int calories) {
        super(calories);
        // TODO Auto-generated constructor stub
    }

    
    
    public String toString() {
        return "I am a chips! " + super.toString();
    }



    public void consume(Object eater) {
        System.out.println("cruch, crunch"+ eater + " ate me!");
    }
}
