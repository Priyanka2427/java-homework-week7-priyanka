package homeworkweek7;

// Write a Java program to sum values of an array.

public class Programme18_SumOfArrayElement {
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Call a function to calculate the sum
        int sum = calculateSum(numbers);

        // Print the result
        System.out.println("The sum of the array is: " + sum);
    }

    // Function to calculate the sum of an array
    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;

    }
}
