import java.util.Scanner;

public class Main {

    // Function to perform calculations
    public static void performCalculation(double number1, double number2, String operator) {
        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case "+":
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                validOperation = false;
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response = "yes";

        System.out.println("Welcome to the Simple Calculator!");

        while (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            String operator = scanner.next();

            performCalculation(number1, number2, operator);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            response = scanner.next();
        }

        System.out.println("Thank you for using the Simple Calculator!");
        scanner.close();
    }
}

