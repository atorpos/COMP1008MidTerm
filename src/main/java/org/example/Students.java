package org.example;

public class Students {

    private String student_name;

    private int student_grade;
//init the student class

    public Students(String student_name) {
        this.student_name = student_name;
//        this.student_grade = student_grade;
    }

//    get student name
    public String getStudent_name() {
        return student_name;
    }

//    get student grade

    public double getStudent_grade() {
        return student_grade;
    }
//set the student name
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
//set the student grade
    public void setStudent_grade(int student_grade) {
        this.student_grade = student_grade;
    }



}
