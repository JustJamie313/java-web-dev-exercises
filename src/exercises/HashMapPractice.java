package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter Student Name or ENTER to finish");

        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")){
                System.out.println("ID Number: ");
                Integer newIDNumber = input.nextInt();
                students.put(newIDNumber,newStudent);
                input.nextLine();
            }
        } while(!newStudent.equals(""));
        System.out.println("\nClass Roster:");
        System.out.println("Student ID\tStudent Name");
        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("\t" + student.getKey() + "\t\t" + student.getValue());
        }
    }
}
