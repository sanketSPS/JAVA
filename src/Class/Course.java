import java.util.*;
import java.lang.*;

class Course {
    static int maxCapacity;

    String courseName;
    int enrollStud=0;
    String studName;

    String[] enrollStudents= new String[maxCapacity];

    static {
        maxCapacity=60;
    }
    {
        enrollStud++;
    }

//    void setMaxCapacity(int maxCapacity){
//        this.m
//    }

    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }
    Course(String courseName){
        this.courseName=courseName;

    }
    String[] enrollStudent(String studName){
//        enrollStudents[enrollStud]=studName;
//        enrollStud++;

       // enrollStudents[] myArr = new int[size];
        if (enrollStud < maxCapacity) {
            //System.out.print("Please enter element " + (enrollStud + 1) + " :");
            //enrollStudents[enrollStud] = input.nextInt();
            enrollStudents[enrollStud]=studName;
            enrollStud++;
            System.out.println("Thanks for taking admission");
        }

        return enrollStudents;
    }

    void unenrollStudent(String studName){
        enrollStudents[enrollStud]=studName;
        enrollStud--;
        System.out.println("Hope you have good experience");
    }
    public static void main(String[] args) {
        Course c1=new Course("JAVA");
        c1.enrollStudent("Sanket");
        System.out.println("Total enroll student:"+c1.enrollStud);
    }
}


