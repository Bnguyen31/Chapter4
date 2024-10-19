import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first integer: ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the second integer: ");
            int num2 = Integer.parseInt(scanner.nextLine());
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

