package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private Teacher teacher;
    private int numberOfCredits;
    private ArrayList<Student> roster = new ArrayList<>();

    //constructors
    public Course(String aName, Teacher aTeacher, int aNumberOfCredits){
        setName(aName);
        setTeacher(aTeacher);
        setNumberOfCredits(aNumberOfCredits);
    }



    //getters
    public ArrayList<Student> getRoster(){
        return roster;
    }
    public String getName(){
        return name;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    //setters
    private void setName(String aName) {
        name = aName;
    }
    private void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }
    private void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    //Data Manipulation
    public void addStudent(Student aStudent){
        roster.add(aStudent);
    }
    public void removeStudent(String aStudentName){
        for(Student s:roster){
            if(s.getName() == aStudentName){
                roster.remove(s);
                break;
            }
        }
    }
}
