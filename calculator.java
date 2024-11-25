import java.util.Scanner;

public class Calculator {
    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator with Six Functions");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 6) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                    break;
            }
        } else {
            System.out.println("Invalid choice. Please select a number between 1 and 6.");
        }

        scanner.close();
    }
}
