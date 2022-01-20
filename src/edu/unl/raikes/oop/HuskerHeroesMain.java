package edu.unl.raikes.oop;

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
        
        order.items.add(sandwich);
        order.items.add(chips);
        order.items.add(drink);
        order.items.add(m1);
        order.items.add(m2);
        
        System.out.println(order);
        
        for(int i=0;i<order.items.size();i++){
            order.items.get(i).consume();
        }
    }
}
