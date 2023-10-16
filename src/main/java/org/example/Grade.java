package org.example;

public class Grade {

    private int studentgrade;

    public Grade(int studentgrade){
        this.studentgrade = studentgrade;
    }

    public int getStudentgrade() {
        return studentgrade;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }
    public String checkMark() {

//        the logic of the grade
        String output_msg = "";
        if (studentgrade >= 90 && studentgrade <= 100) {
            return   " is excellent.";
        } else if (studentgrade >= 70) {
            return  " is good";
        } else if (studentgrade >= 60) {
            return " should work harder.";
        } else {
            return " has failed";
        }


    }

}
