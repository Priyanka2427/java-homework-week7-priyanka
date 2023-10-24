package homeworkweek7;

import java.util.Scanner;

// find out if it is leap year or not?

public class Programme02_LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year:  ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year. ");
        } else {
            System.out.println(year + " is not a leap year. ");
        }
        sc.close();
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
