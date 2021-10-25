package edu.unl.raikes.arraylists;

import java.util.ArrayList;

public class HeirsToBritishRoyalThrone {

    public static void main(String[] args) {
        // create empty list of heirs
        ArrayList<String> heirs = new ArrayList<String>();

// add current heirs, in order, to the array list
        heirs.add("Prince Charles");
        heirs.add("Prince William");
        heirs.add("Prince George");
        heirs.add("Princess Charlotte");
        heirs.add("Prince Louis");
        heirs.add("Prince Harry");
        heirs.add("Archie Mountbatten-Windsor");
        heirs.add("Prince Andrew");
        heirs.add("Princess Beatrice");
        heirs.add("Princess Eugenie");

// add prince Edward to the list
        heirs.add("Prince Edward");

// add baby sussex to the 8th spot
        heirs.add(7, "Baby Sussex");

        System.out.println(heirs);

// where in the line is Princess Eugenie?
        System.out.println("Princess Eugenie is #" + heirs.indexOf("Princess Eugenie"));

// who is 4th in line?
        System.out.println("The fourth heir is: " + heirs.get(3));

// find and remove Prince Louis
        int louis = heirs.indexOf("Prince Louis");
        heirs.remove(louis);

// call charlotte charlie
        heirs.set(3, "Princess Charlie");

            // is kate on the list?
        boolean kate = heirs.contains("Catherine Duchess of Cambridge");
        System.out.println("it is " + kate + " that Catherine Duchess of Cambridge is on the list");

        uppercaseRs(heirs);

        System.out.println(heirs);
        System.out.println(heirs.size());
    }

    public static void uppercaseRs(ArrayList<String> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).startsWith("P")) {
                a.set(i, a.get(i).toUpperCase());
            }
        }
    }

}
