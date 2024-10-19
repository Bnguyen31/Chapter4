import java.util.Random;
import java.util.Scanner;

public class ArrayRandomValues {
    public static void main(String[] args) {
        double[] arr = new double[50];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 100; // Random double that is between 0 and 100
        }

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an index (0-49): ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds. Please enter a number between 0 and 49.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
