package homeworkweek7;
// to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Programme16_PositiveNegativeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.println("The entered number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The entered number is NEGATIVE.");
        } else {
            System.out.println("The entered number is ZERO.");
        }

        sc.close();

    }
}