package exercises;
import java.util.Scanner;
public class CalculateMPG {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Enter fuel consumed in gallons: ");
        double fuel = input.nextDouble();
        System.out.println("You traveled " + miles + " miles, consuming " + fuel + " gallons of fuel.  For this trip, you averaged " + miles/fuel + " MPG!");

    }
}
