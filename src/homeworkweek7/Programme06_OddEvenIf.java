package homeworkweek7;

// Write program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Programme06_OddEvenIf {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number:  ");

        // Read the input as an integer
        int number = sc.nextInt();

        // Close the scanner to free up resources
        sc.close();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even. ");
        } else {
            System.out.println(number + "is odd.  ");
        }
    }
}
