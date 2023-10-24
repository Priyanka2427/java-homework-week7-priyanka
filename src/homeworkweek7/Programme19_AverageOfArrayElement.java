package homeworkweek7;

// Write a Java program to calculate the average value of array elements.

public class Programme19_AverageOfArrayElement {
    public static void main(String[] args) {
        // Define an array of numbers
        double[] numbers = {5.5, 10.0, 15.5, 20.0, 25.5};

        // Calculate the sum of all elements in the array
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }

        // Calculate the average
        double average = sum / numbers.length;

        System.out.println("The average of the array elements is: " + average);
    }
}
