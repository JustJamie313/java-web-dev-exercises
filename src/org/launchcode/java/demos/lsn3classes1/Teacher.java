package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    //constructors
    public Teacher(String aFirstName, String aLastName, String aSubject, int aYearsTeaching){
        setFirstName(aFirstName);
        setLastName(aLastName);
        setSubject(aSubject);
        setYearsTeaching(aYearsTeaching);
    }
    //getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }

    //setters
    private void setFirstName(String aFirstName){
        firstName = aFirstName;
    }
    private void setLastName(String aLastName){
        lastName = aLastName;
    }
    private void setSubject(String aSubject){
        subject = aSubject;
    }
    private void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}
