package edu.unl.raikes.sortingII;

import java.util.Arrays;

public class JellyBeanMain {
    public static void main(String[] args) {
        // create 4 jelly beans
        JellyBeans aBean = new JellyBeans(4, null, "vomit", "Bertie's");
        JellyBeans bBean = new JellyBeans(10, null, "strawberry", "Jelly Belly");
        JellyBeans cBean = new JellyBeans(2, null, "earwax", "Bertie's");
        JellyBeans dBean = new JellyBeans(4, null, "root beer", "starburst");
        
        JellyBeans[] jbs = {aBean, bBean, cBean, dBean};
        
        System.out.println(Arrays.toString(jbs));
        
        Arrays.sort(jbs, new JellyBeanFlavorComparator());
        
        System.out.println(Arrays.toString(jbs));

    }
}
