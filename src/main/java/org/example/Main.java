package org.example;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter the Student Name: ");
//    input student name
        String student_name = input.next();

        System.out.println("Enter Student final Grade: ");
//        input student grade
        int input_grade = input.nextInt();
//      add student name and grade into class
        Students getinput = new Students(student_name);
        Grade gradeinput = new Grade(input_grade);
//        printout the result
        System.out.printf("%s%s%n", getinput.getStudent_name(), gradeinput.checkMark());

    }
}