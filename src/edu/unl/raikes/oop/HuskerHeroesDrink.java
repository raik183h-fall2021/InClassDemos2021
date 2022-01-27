package edu.unl.raikes.oop;

public class HuskerHeroesDrink extends HuskerHeroesFood{

    public HuskerHeroesDrink(int calories) {
        super(calories);
        // TODO Auto-generated constructor stub
    }
    // does it have a straw?
    
    public String toString() {
        return "I am a drink! " + super.toString();
    }

    
    public void consume(Object eater) {
        System.out.println("shlurp, shlurp"+ eater + " ate me!");
    }
}
