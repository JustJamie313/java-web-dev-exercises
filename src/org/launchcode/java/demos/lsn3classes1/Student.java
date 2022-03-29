package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.text.DecimalFormat;
import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    public static final DecimalFormat DF = new DecimalFormat("0.00");

    //constructors
    public Student(String aName,int aStudentId,int aNumberOfCredits,double aGpa){
        setName(aName);
        setStudentId(aStudentId);
        setNumberOfCredits(aNumberOfCredits);
        setGpa(aGpa);
    }
    public Student(String aName, int aStudentId){
        this(aName,aStudentId,0,0.0);
    }

    //getters
    public String getName(){
        return name;
    }
    public int getStudentId(){
        return studentId;
    }
    public int getNumberOfCredits(){
        return numberOfCredits;
    }
    public double getGpa(){
        return gpa;
    }

    //setters
    private void setName(String aName){
        name = aName;
    }
    private void setStudentId(int aStudentId){
        studentId = aStudentId;
    }
    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }
    private void setGpa(double aGpa){
        gpa = aGpa;
    }

    //data manipulation
    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = this.gpa*this.numberOfCredits;
        double newQualityScore = currentQualityScore+(grade*courseCredits);
        this.numberOfCredits+=courseCredits;
        this.gpa = newQualityScore/this.numberOfCredits;
    }

    public String getGradeLevel() {
        if(this.numberOfCredits<30){
            return "Freshman ";
        }
        if(this.numberOfCredits<60){
            return "Sophomore";
        }
        if(this.numberOfCredits<90){
            return "Junior   ";
        }
        return "Senior   ";
    }

    @Override
    public String toString() {
        return studentId + "\t" + getGradeLevel() + "\t\t" + numberOfCredits + "\t\t\t" + DF.format(gpa) + "\t" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}