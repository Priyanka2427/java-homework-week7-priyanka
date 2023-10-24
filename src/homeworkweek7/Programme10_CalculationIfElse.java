package homeworkweek7;
// (using if else)

import java.util.Scanner;

public class Programme10_CalculationIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:  ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:  ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operation (+, - , *, / ):  ");
        char operator = sc.next().charAt(0);

        double result;
        if (operator == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        } else {
            System.out.println("Invalid operator. Please enter +, -, *, or /.");
        }

        sc.close();
    }
}









