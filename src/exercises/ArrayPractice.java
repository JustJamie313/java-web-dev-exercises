package exercises;

import java.util.Arrays;
import java.util.regex.Pattern;


public class ArrayPractice {
    public static void main(String[] args) {
        int[] values = {1,1,2,3,5,8};
        String text = "I would not, could not, in a box.  I would not, could not with a fox.  I will not eat them in a house.  I will not eat them with a mouse.";
        String[] textArray = text.split(Pattern.quote("."));
        for (int i : values){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        System.out.println(Arrays.toString(textArray));
    }
}
