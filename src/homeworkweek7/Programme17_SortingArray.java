package homeworkweek7;

//Java program that sorts both a numeric array and a string array

import java.util.Arrays;

public class Programme17_SortingArray {
    public static void main(String[] args) {

            // Numeric Array
            int[] numericArray = {4, 2, 9, 1, 5, 8, 3, 7, 6};

            System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
            Arrays.sort(numericArray);
            System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

            // String Array
            String[] stringArray = {"apple", "banana", "grape", "cherry", "date"};

            System.out.println("Original String Array: " + Arrays.toString(stringArray));
            Arrays.sort(stringArray);
            System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
        }
    }


