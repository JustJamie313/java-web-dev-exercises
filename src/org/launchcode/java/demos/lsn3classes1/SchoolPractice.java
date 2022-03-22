package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Andie","Johnson","Java/Web Development",5);
        Course ourCourse = new Course(teacher.getSubject(),teacher,1);
        ourCourse.addStudent(new Student("Jamie",1,ourCourse.getNumberOfCredits(),4.0));
        ourCourse.addStudent((new Student("LaunchCode TA",2,ourCourse.getNumberOfCredits(),0.0)));
        ourCourse.addStudent(new Student("Another Student",3,ourCourse.getNumberOfCredits(),2.0));
        ourCourse.addStudent(new Student("Yet Another",4,ourCourse.getNumberOfCredits(),3.0));
        displayRoster(ourCourse);
        ourCourse.removeStudent("LaunchCode TA");
        displayRoster(ourCourse);
    }
    private static void displayRoster(Course aOurCourse){
        ArrayList<Student> courseRoster = aOurCourse.getRoster();
        System.out.println(aOurCourse.getName()+"\nCredits: "+aOurCourse.getNumberOfCredits() + "\n");
        System.out.println("ID\tGPA\tNAME");
        for(Student student:courseRoster){
            System.out.println(student.getStudentId()+"\t"+student.getGpa()+"\t"+student.getName());
        }
    }
}
