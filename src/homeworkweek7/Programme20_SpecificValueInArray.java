package homeworkweek7;
 // Write a Java program to test if an array contains a specific value.

public class Programme20_SpecificValueInArray {
    // Function to check if the array contains a specific value
    public static boolean containsValue(int[] arr, int targetValue) {
        for (int num : arr) {
            if (num == targetValue) {
                return true; // Value found in the array
            }
        }
        return false; // Value not found in the array
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int targetValue = 3;

        if (containsValue(array, targetValue)) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}