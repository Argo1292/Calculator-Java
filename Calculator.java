import java.util.Arrays;

public class Calculator {

    // Function to add two numbers
    public static void addTwoNumbers() {
        // Get two numbers from user input
        double[] numbers = UserInput.getTwoNumbers();
        // Calculate the sum
        double result = numbers[0] + numbers[1];
        // Display the result
        System.out.println("Sum: " + result);
    }


    // Function to subtract two numbers
    public static void subtractTwoNumbers() {
        // Get two numbers from user input
        double[] numbers = UserInput.getTwoNumbers();
        // Calculate the difference
        double result = numbers[0] - numbers[1];
        // Display the result
        System.out.println("Difference: " + result);
    }


    // Function to multiply two numbers
    public static void multiplyTwoNumbers() {
        // Get two numbers from user input
        double[] numbers = UserInput.getTwoNumbers();
        // Calculate the product
        double result = numbers[0] * numbers[1];
        // Display the result
        System.out.println("Product: " + result);
    }


    // Function to divide two numbers
    public static void divideTwoNumbers() {
        // Get two numbers from user input
        double[] numbers = UserInput.getTwoNumbers();
        // Check if the divisor is not zero
        if (numbers[1] != 0) {
            // Calculate the quotient
            double result = numbers[0] / numbers[1];
            // Display the result
            System.out.println("Quotient: " + result);
        } else {
            // Display an error message for division by zero
            System.out.println("Cannot divide by zero.");
        }
    }


    // Function to perform various operations on an array
    public static void calculateArrayOperations() {
        // Get an array from user input
        double[] array = UserInput.getArray();

        // Sort the array for median and mode calculations
        Arrays.sort(array);

        // Calculate and display array operations
        double sum = Arrays.stream(array).sum();
        double mean = sum / array.length;
        double median = array.length % 2 == 0 ?
                (array[array.length / 2 - 1] + array[array.length / 2]) / 2 :
                array[array.length / 2];
        double mode = calculateMode(array);
        double variance = calculateVariance(array, mean);
        double standardDeviation = Math.sqrt(variance);

        // Display the calculated values
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        System.out.println("Variance: " + variance);
        System.out.println("Standard Deviation: " + standardDeviation);
    }


    // Function to calculate mode of an array
    private static double calculateMode(double[] array) {
        // Sort the array for mode calculation
        Arrays.sort(array);

        double mode = array[0];  // Assume the first element is the mode
        int currentStreak = 1;   // Current streak of repeated elements
        int maxStreak = 1;       // Maximum streak of repeated elements

        // Iterate through the sorted array to find the mode
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentStreak++;

                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                    mode = array[i];
                }
            } else {
                currentStreak = 1;  // Reset streak for a new element
            }
        }

        return mode;
    }


    // Function to calculate variance of an array
    private static double calculateVariance(double[] array, double mean) {
        double sumSquaredDifferences = 0;

        // Calculate the sum of squared differences from the mean
        for (double num : array) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        // Calculate and return the variance
        return sumSquaredDifferences / array.length;
    }
}
