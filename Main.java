/*
 * Name: Rampalli Agni Mithra
 * PRN: 22070126083
 * Batch: 2nd Year 5
 * B1
 */

public class Main {
    public static void main(String[] args) {

        // Get user choice for operation
        char operation = UserInput.getOperation();

        // Perform operation based on user choice
        switch (operation) {
            case '1':
                Calculator.addTwoNumbers();
                break;
            case '2':
                Calculator.subtractTwoNumbers();
                break;
            case '3':
                Calculator.multiplyTwoNumbers();
                break;
            case '4':
                Calculator.divideTwoNumbers();
                break;
            case '5':
                Calculator.calculateArrayOperations();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
