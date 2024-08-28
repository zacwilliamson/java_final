import java.util.Scanner; // Import the Scanner class for user input

public class Main {

    // Method to perform calculations based on user input
    public static void performCalculation(double number1, double number2, String operator) {
        double result = 0; // Variable to store the result of the calculation
        boolean validOperation = true; // Flag to check if the operation is valid

        // Switch statement to determine the operation based on the operator input
        switch (operator) {
            case "+":
                // Addition operation
                result = number1 + number2;
                System.out.println("Result: " + result); // Output the result
                break;
            case "-":
                // Subtraction operation
                result = number1 - number2;
                System.out.println("Result: " + result); // Output the result
                break;
            case "*":
                // Multiplication operation
                result = number1 * number2;
                System.out.println("Result: " + result); // Output the result
                break;
            case "/":
                // Division operation
                if (number2 != 0) {
                    // Check for division by zero
                    result = number1 / number2;
                    System.out.println("Result: " + result); // Output the result
                } else {
                    System.out.println("Error: Division by zero is not allowed."); // Error message for division by zero
                }
                break;
            default:
                // Error message for invalid operator
                System.out.println("Error: Invalid operator.");
                validOperation = false; // Set flag to false indicating an invalid operation
                break;
        }
    }

    // Main method to execute the calculator program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        String response = "yes"; // Variable to store user response for repeating calculations

        System.out.println("Welcome to the Simple Calculator!"); // Welcome message

        // Loop to allow multiple calculations until the user decides to stop
        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble(); // Read the first number

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble(); // Read the second number

            System.out.print("Enter the operator (+, -, *, /): ");
            String operator = scanner.next(); // Read the operator

            performCalculation(number1, number2, operator); // Call the method to perform the calculation

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            response = scanner.next(); // Read user response for continuing or exiting
        }

        System.out.println("Thank you for using the Simple Calculator!"); // Thank you message
        scanner.close(); // Close the Scanner object to free resources
    }
}


