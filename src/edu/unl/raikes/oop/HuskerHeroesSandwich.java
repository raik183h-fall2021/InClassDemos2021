package edu.unl.raikes.oop;

public class HuskerHeroesSandwich extends HuskerHeroesFood {

    // pesto
    private boolean pesto;

    public HuskerHeroesSandwich(int calories) {
        super(calories);
        // TODO Auto-generated constructor stub
    }
    
    public HuskerHeroesSandwich(int calories, boolean pesto) {
        super(calories);
        this.setPesto(pesto);
    }

    /**
     * Returns the pesto that belongs to the HuskerHeroesSandwich class.
     *
     * @return the pesto
     */
    public boolean isPesto() {
        return pesto;
    }

    /**
     * Allows a user of this class to set a HuskerHeroesSandwich object's pesto.
     *
     * @param pesto the pesto to set
     */
    public void setPesto(boolean pesto) {
        this.pesto = pesto;
    }

    
    public String toString() {
        String s= "I am a sandwich! I ";
        if(!pesto) {
            s += "do not ";
        }
        s += "have pesto." + super.toString();
        return s;
    }


    @Override
    public void consume(Object eater) {
        // TODO Auto-generated method stub
        System.out.println(" munch, nom, munch" + eater + " ate me!");  
    }
}
