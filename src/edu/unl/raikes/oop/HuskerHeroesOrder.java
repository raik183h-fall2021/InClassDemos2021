package edu.unl.raikes.oop;

import java.util.ArrayList;

public class HuskerHeroesOrder {
    public ArrayList<HuskerHeroesFood> items = new ArrayList<HuskerHeroesFood>();
    
    public String toString() {
        String s = "Your order contains: ";
        for(int i=1;i<=items.size();i++) {
            s+= "\n  "+i+". "+items.get(i-1).toString();
        }
        return s;
    }
}
