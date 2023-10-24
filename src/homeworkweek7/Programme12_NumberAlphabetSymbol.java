package homeworkweek7;

import java.util.Scanner;
// input value is number or an alphabet or symbol.

public class Programme12_NumberAlphabetSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);

        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println("The input is an alphabet.");
        } else if (input >= '0' && input <= '9') {
            System.out.println("The input is a number.");
        } else {
            System.out.println("The input is a symbol.");
        }
        sc.close();
    }
}