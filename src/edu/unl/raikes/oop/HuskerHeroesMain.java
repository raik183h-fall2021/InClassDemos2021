package edu.unl.raikes.oop;

import java.util.ArrayList;

public class HuskerHeroesMain {


    public static void main(String[] args) {
        // start a new order
        HuskerHeroesOrder order = new HuskerHeroesOrder();
        
        // order a sandwich
        HuskerHeroesFood sandwich = new HuskerHeroesSandwich(600,true);
        // order chips
        HuskerHeroesFood chips = new HuskerHeroesChips(200);
        // order drink
        HuskerHeroesFood drink = new HuskerHeroesDrink(0);
        // order milkshake
        HuskerHeroesFood m1 = new HuskerHeroesMilkshake(5);
        // order another milkshake (duh)
        HuskerHeroesFood m2 = new HuskerHeroesMilkshake(5);
        
        ArrayList<Edible> eds = new ArrayList<Edible>();
        eds.add(m2);
        eds.add(m1);
        eds.add(drink);
        eds.add(sandwich);
        eds.add(chips);
        eds.add(new HurtsDonut());
        
        System.out.println(order);
        Jace jace = new Jace();
        
        for(int i=0;i<eds.size();i++){
            eds.get(i).consume(jace);
        }
    }
}
