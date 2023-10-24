package homeworkweek7;

// print the numbers between 1 to100 which can be divided by 3 & 5 separately.

public class Programme11_DivideBy3And5 {
    public static void main(String[] args) {
        printNumbersDivisibleBy3(1);
        printNumbersDivisibleBy5(1);
    }

    public static void printNumbersDivisibleBy3(int number) {
        if (number > 100) {
            return;
        }

        if (number % 3 == 0) {
            System.out.print(number + " ");
        }

        printNumbersDivisibleBy3(number + 1);
    }

    public static void printNumbersDivisibleBy5(int number) {
        if (number > 100) {
            return;
        }

        if (number % 5 == 0) {
            System.out.print(number + " ");
        }

        printNumbersDivisibleBy5(number + 1);

    }
}











