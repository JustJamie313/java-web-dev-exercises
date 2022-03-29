package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String name;
    private Teacher teacher;
    private int numberOfCredits;
    private final ArrayList<Student> roster = new ArrayList<>();

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
            if(s.getName().equals(aStudentName)){
                roster.remove(s);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String returnString = "Course: "+name+"\nInstructor: "+teacher.getFullName()+"\nCredits: "+numberOfCredits+"\nStudent Roster:\nID\tGRADE LEVEL\t  CREDITS\t\tGPA\t\tNAME\n----------------------------------------------------\n";
        StringBuilder sb = new StringBuilder();
        for(Student student: roster){
            sb.append(student.toString()).append("\n");
        }
        return returnString + sb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return numberOfCredits == course.numberOfCredits && name.equals(course.name) && teacher.equals(course.teacher) && roster.equals(course.roster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher, numberOfCredits, roster);
    }
}
