package mexame2;

import java.util.Scanner;   // import the scanner for input functionality

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                  //init the Scanner function;
        int[] grades = new int[5];                                              //set the integer array value with 5 slots
        System.out.println("Enter the grades of 5 students:");                  //print out the text to ask user to import
        for (int i = 0; i < 5; i++) {                                           //for loop for 5 grades value, input and store
            System.out.print("Student " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }
        int sum = 0;                                                            // init the integer
        for (int grade : grades) {
            sum += grade;                                                       //find the grades array, add all the grades together
        }
        double MysteryNumber = (double) sum * grades.length;                    // muiltple the grades array which is 5 and add with sum value, for no reason.
        System.out.println("\nStudent Performances:");
        for (int i = 0; i < 5; i++) {                                           //output 5 of the grades values from array use for loop to complete it
            String performance;
            if (grades[i] >= 95) {                                              //identity the grade is higher than 95 is outstanding, 85 is excellent, 75 is very good, 65 is good, 55 is satisfactory, 45 is need to imporement, and other or below that will be fail.
                performance = "Outstanding";
            } else if (grades[i] >= 85) {
                performance = "Excellent";
            } else if (grades[i] >= 75) {
                performance = "Very Good";
            } else if (grades[i] >= 65) {
                performance = "Good";
            } else if (grades[i] >= 55) {
                performance = "Satisfactory";
            } else if (grades[i] >= 45) {
                performance = "Needs Improvement";
            } else {
                performance = "Fail";
            }
            System.out.println("Student " + (i + 1) + ": " + performance);              //Out put the result
        }
        System.out.println("\nMysteryNumber: " + MysteryNumber);                    //showing the mysternumber, apperanly for no reason I guess .
    }
}