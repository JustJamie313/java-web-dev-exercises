package org.launchcode.java.studios.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class CountCharacters {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("src/org/launchcode/java/studios/CountingCharacters/text.txt");
        Scanner input = new Scanner(file);
        String text = input.nextLine().toLowerCase().replaceAll("[^a-z]","");
        char[] characterArray = text.toCharArray();
        HashMap<Character,Integer> characterCounts = new HashMap<>();
        for(char character : characterArray){
            if(!characterCounts.containsKey(character)){
                characterCounts.put(character,1);
            } else {
                characterCounts.put(character,characterCounts.get(character)+1);
            }
        }
        for(Map.Entry<Character, Integer> count : characterCounts.entrySet()){
            System.out.println(count.getKey() + ":"+count.getValue());
        }
        input.close();
    }
}
