package exercises;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        double w = input.nextDouble();
        System.out.println("What is the height of the rectangle?");
        double h = input.nextDouble();
        System.out.println("The area of a " + w + " x " + h + " rectangle is: " + w*h);
    }
}
