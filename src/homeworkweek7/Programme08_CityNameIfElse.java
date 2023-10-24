package homeworkweek7;

import java.util.Scanner;

// (use if else)
public class Programme08_CityNameIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet (A to F): ");
        char input = sc.next().toUpperCase().charAt(0);
        // Convert to uppercase for case insensitivity

        String cityName;

        if (input == 'A') {
            cityName = "City A";
        } else if (input == 'B') {
            cityName = "City B";
        } else if (input == 'C') {
            cityName = "City C";
        } else if (input == 'D') {
            cityName = "City D";
        } else if (input == 'E') {
            cityName = "City E";
        } else if (input == 'F') {
            cityName = "City F";
        } else {
            cityName = "Invalid entry";
        }

        System.out.println("City Name: " + cityName);
    }
}
