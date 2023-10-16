package mexame3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //        add the scanner function and call class
        Scanner sc = new Scanner(System.in);

        Main newc = new Main();
//        set the first attempt is 0 and assign the int value to 0 as well.
        int i = 0;
        int e_ano = 0;
//        the do while loop for max three trial
        do {
            System.out.println("Enter a number (1-7): ");
//            input the value of day
            e_ano = sc.nextInt();
//            checker if the numebr is 1-7; if no i will plus one
            if (Objects.equals(newc.check_day(e_ano), "Invaild input. Plxease enter a number betweet 1 and 7")) {
                i++;
                if (i == 3) {
//                    if more than 3 times, program will exit
                    System.out.println("You've exceed the maximum number of attempts");
                    break;
                }
                System.out.printf("%s%n", newc.check_day(e_ano));
            } else {
                System.out.printf("Day of the week: %s %n", newc.check_day(e_ano));
                break;
            }

        } while (i < 3);


    }
//    to check the day class
    public String check_day(int no_day) {

//        logic of the week in string
        if (no_day == 1) {
            return "Monday";
        } else if (no_day == 2) {
            return "Tuesday";
        } else if (no_day == 3) {
            return "Wednesday";
        } else if (no_day == 4) {
            return "Thursday";
        } else if (no_day == 5) {
            return "Friday";
        } else if (no_day == 6) {
            return "Satursday";
        } else if (no_day == 7) {
            return "Sunday";
        } else {
            return "Invaild input. Please enter a number betweet 1 and 7";
//            if not match the input is invaild
        }

    }


}


