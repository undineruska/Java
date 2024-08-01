import java.util.Scanner;

public class SwapNumbersWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);

        // Swapping using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping:");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
}
