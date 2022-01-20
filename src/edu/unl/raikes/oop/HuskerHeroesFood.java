package edu.unl.raikes.oop;

public abstract class HuskerHeroesFood {
    private int calories;
    // calories?
    
    public HuskerHeroesFood(int calories) {
        this.setCalories(calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    
    public abstract void consume();
    
    public String toString() {
        return "Yummy! I have "+calories+" calories.";
    }
}
