package org.launchcode.java.demos.lsn3classes1;


import java.util.ArrayList;

public class SchoolPractice {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Andie","Johnson","Java/Web Development",5);
        Course ourCourse = new Course(teacher.getSubject(),teacher,1);
        Course anotherCourse = new Course(teacher.getSubject(),teacher,1);
        Student me = new Student("Jamie",1,ourCourse.getNumberOfCredits(),4.0);
        Student meAgain = new Student("Jamie Miller",1,62,3.95);
        ourCourse.addStudent(meAgain);
//        anotherCourse.addStudent(new Student("Extra Student",7,35,3.89));
        ourCourse.addStudent(me);
        me.addGrade(4,3.5);
        ourCourse.addStudent((new Student("LaunchCode TA",2,ourCourse.getNumberOfCredits(),0.0)));
        ourCourse.addStudent(new Student("Another Student",3,ourCourse.getNumberOfCredits(),2.0));
        ourCourse.addStudent(new Student("Yet Another",4,ourCourse.getNumberOfCredits(),3.0));
        ourCourse.removeStudent("LaunchCode TA");
        System.out.println("Duplicate Students?: "+ me.equals(meAgain));
        System.out.println("Duplicate Courses?: "+ ourCourse.equals(anotherCourse));
        for(Student student:ourCourse.getRoster()){
            anotherCourse.addStudent(student);
        }
        System.out.println("Duplicate Courses?: "+ ourCourse.equals(anotherCourse));
        System.out.println(ourCourse);
    }
}
