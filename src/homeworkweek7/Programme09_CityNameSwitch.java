package homeworkweek7;

import java.util.Scanner;

// Using switch statement.
public class Programme09_CityNameSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet (A to F):   ");
        char alphabet = sc.next().charAt(0);

        char k = 'A';

        switch (alphabet) {
            case 'A':
                System.out.println("Aylesbury");
                break;
            case 'B':
                System.out.println("Berlin");
                break;
            case 'C':
                System.out.println("Cambidge");
                break;
            case 'D':
                System.out.println("Derby");
                break;
            case 'E':
                System.out.println("East London");
                break;
            case 'F':
                System.out.println("France");
                break;
            default:
                System.out.println("Invalid entry");

        }

    }
}
