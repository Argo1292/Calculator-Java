import java.util.Scanner;

public class UserInput {
    // Function to get user choice for operation
    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);

        // Display menu to the user
        System.out.println("Choose an operation:");
        System.out.println("1. Add Two Numbers");
        System.out.println("2. Subtract Two Numbers");
        System.out.println("3. Multiply Two Numbers");
        System.out.println("4. Divide Two Numbers");
        System.out.println("5. Array Operations");
        System.out.print("Enter your choice: ");

        // Return user input
        return scanner.next().charAt(0);
    }

    // Function to get input for two numbers
    public static double[] getTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[2];

        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextDouble();

        return numbers;
    }

    // Function to get input for an array
    public static double[] getArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        // Loop to get user input for each element in the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}
