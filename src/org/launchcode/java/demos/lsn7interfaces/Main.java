package org.launchcode.java.demos.lsn7interfaces;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();


        flavors.sort(new FlavorComparator());
        cones.sort(new FlavorComparator());
        toppings.sort(new FlavorComparator());

        System.out.println("\nSorted Alphabetically By Name");
        displayList("Flavors",flavors,false);
        displayList("Cones",cones,false);
        displayList("Toppings",toppings,false);

        flavors.sort(new CostComparator());
        cones.sort(new CostComparator());
        toppings.sort(new CostComparator());

        System.out.println("\nSorted By Price");
        displayList("Flavors",flavors,false);
        displayList("Cones",cones,false);
        displayList("Toppings",toppings,false);

        flavors.sort(new AllergenCountComparator());
        cones.sort(new AllergenCountComparator());
        toppings.sort(new AllergenCountComparator());

        System.out.println("\nSorted By Allergen Count - High to Low");
        displayList("Flavors",flavors,true);
        displayList("Cones",cones,true);
        displayList("Toppings",toppings,true);
    }
    private static void displayList(String aDisplayText,ArrayList<? extends Ingredient> aIngredient, boolean displayAllergens){
        final DecimalFormat DF = new DecimalFormat("$0.00");
        System.out.println("\n"+aDisplayText);
        for(Ingredient ingredient:aIngredient){
            System.out.println(DF.format(ingredient.getCost()) + "\t" + ingredient.getName());
            if(displayAllergens){
                for(String allergen:ingredient.getAllergens()){
                    System.out.println("\t"+allergen);
                }
            }
        }
    }
}
