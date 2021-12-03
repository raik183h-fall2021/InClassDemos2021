package edu.unl.raikes.sortingII;

import java.util.Comparator;

public class JellyBeanFlavorComparator implements Comparator<JellyBeans>{
    public int compare(JellyBeans a, JellyBeans b) {
        return a.getFlavor().compareTo(b.getFlavor());
    }
}
