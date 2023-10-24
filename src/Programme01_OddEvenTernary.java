import java.util.Scanner;

// HINT: use ternary operator

public class Programme01_OddEvenTernary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:  ");
        int number = sc.nextInt();

        String result = (number % 2 == 0) ? "even" : " odd ";
        System.out.println("The input number is " + result + " . ");


    }
}
