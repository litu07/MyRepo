package SimpleCalculator;
    import java.util.Scanner;

/**
 * Calculator
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator!");
        System.out.println("Enter two numbers:");

        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition result: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction result: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication result: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    result = num1 / num2;
                    System.out.println("Division result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

