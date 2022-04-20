package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class CostComparator implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient o1, Ingredient o2) {
        double cost = o1.getCost() - o2.getCost();
        if(cost > 0 ){
            return 1;
        } else if (cost < 0){
            return -1;
        }
        return 0;
    }
}
