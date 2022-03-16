package exercises;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        String text = "I would not, could not, in a box.  I would not, could not with a fox.  I will not eat them in a house.  I will not eat them with a mouse.";
        ArrayList<String> textArrayList = convertStringToArrayList(text);

        ArrayList<Integer> values = createRandomIntegerArrayList(10,100);
        displayResults(values);

        Integer wordLength = promptForInteger("Enter Word Length: ","");
        displayWordsByLength(textArrayList, wordLength);
    }
    public static int sumByEvenOrOdd(ArrayList<Integer> values, boolean even){
        int sum = 0;
        for(int i : values){
            if(even){
                if(i%2==0){
                    sum += i;
                }
            } else {
                if(i%2!=0){
                    sum += i;
                }
            }
        }
        return sum;
    }
    public static void displayWordsByLength(ArrayList<String> listOfWords,int wordLength){
        for(String word : listOfWords){
            if(word.length() == wordLength){
                System.out.println(word);
            }
        }
    }
    public static ArrayList<Integer> createRandomIntegerArrayList(Integer count, Integer maxValue){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(int i=0;i<count;i++){
            newArrayList.add((int) Math.ceil(Math.random()*maxValue));
        }
        return newArrayList;
    }

    public static void displayResults(ArrayList<Integer> values) {
        System.out.println("Values: " + values);
        System.out.println("Sum of Even Values:\t" + sumByEvenOrOdd(values,true));
        System.out.println("Sum of Odd Values:\t" + sumByEvenOrOdd(values, false));
        System.out.println("Sum of All Values:\t" + (sumByEvenOrOdd(values, true) + sumByEvenOrOdd(values, false)));
    }
    public static ArrayList<String> convertStringToArrayList(String text){
        ArrayList<String> textArrayList = new ArrayList<>();
        String[] textArray = text.replaceAll("[^A-Za-z ]","").split(" ");
        textArrayList.addAll(Arrays.asList(textArray));
        return textArrayList;
    }
    public static Integer promptForInteger(String prompt, String message){
        Scanner input = new Scanner(System.in);
        System.out.println(message + prompt);
        String wordLength = input.nextLine();

        while(wordLength.equals("")){

            wordLength = promptForInteger(prompt, "Integer cannot be empty.\n").toString();
        }
        try{
            while(Integer.parseInt(wordLength)<1){
                wordLength = promptForInteger(prompt, "Integer must be > 0.\n").toString();
            }
        } catch (NumberFormatException e){
            wordLength = promptForInteger(prompt, "Integer must be a number.\n").toString();
        }
        input.close();
        return Integer.parseInt(wordLength);
    }
}
