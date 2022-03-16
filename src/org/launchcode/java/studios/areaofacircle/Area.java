package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        String radius = input.nextLine();
        System.out.println("Enter the Units of Measure: ");
        String units = input.nextLine();
        boolean isNumber = false;
        while(radius.isEmpty()){
            System.out.println("Radius is required.");
            System.out.println("Enter the radius of a circle: ");
            radius = input.nextLine();
        }
        do{
            try{
                while(Double.parseDouble(radius)<0){
                    System.out.println("Radius must be greater than zero");
                    System.out.println("Enter the radius of a circle: ");
                    radius = input.nextLine();

                }
                isNumber = true;
                System.out.println("Given a circle with a radius of " + Double.parseDouble(radius) + units + ", the area is: " + Circle.getArea(Double.parseDouble(radius)) + " square " + units);
            } catch (NumberFormatException e){
                System.out.println("Radius must be a number.");
                System.out.println("Enter the radius of a circle: ");
                radius = input.nextLine();
            }
        } while(!isNumber);
        input.close();
    }
}
