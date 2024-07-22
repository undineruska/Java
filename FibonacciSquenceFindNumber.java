import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Variable to store the Fibonacci sequence length
    int n = 0;

    // Loop to get valid positive integer for sequence length
    while (true) {
      try {
        // Prompt user for sequence length
        System.out.print("Enter the length of the Fibonacci sequence (positive number): ");
        n = Integer.parseInt(scanner.nextLine());

        // Validate if the input is a positive number
        if (n <= 0) {
          System.out.println("Invalid input. Please enter a positive number.");
        } else {
          // Exit the loop if valid input is entered
          break;
        }
      } catch (NumberFormatException e) {
        // Handle invalid input (not an integer)
        System.out.println("Invalid input. Please enter a positive number.");
      }
    }

    // Variable to store the desired Fibonacci number index
    int m = 0;

    // Loop to get valid index within the sequence length
    while (true) {
      try {
        // Prompt user for Fibonacci number index with dynamic range message
        System.out.print("Choose a number from 1 to " + n + " in the sequence: ");
        m = Integer.parseInt(scanner.nextLine());

        // Validate if the index is within the valid range (1 to n)
        if (m <= 0 || m > n) {
          System.out.println("Invalid input. Please enter a number between 1 and " + n + ".");
        } else {
          // Exit the loop if valid index is entered
          break;
        }
      } catch (NumberFormatException e) {
        // Handle invalid input (not an integer)
        System.out.println("Invalid input. Please enter a number between 1 and " + n + ".");
      }
    }

    // Calculate the desired Fibonacci number using the getFibonacciNumber function
    int fibNumber = getFibonacciNumber(m);

    // Print the calculated Fibonacci number with a clear message
    System.out.println("The " + m + "th Fibonacci number in the sequence of length " + n + " is " + fibNumber);

    // Close the Scanner object to release resources
    scanner.close();
  }

  /**
   * This function calculates the nth Fibonacci number.
   *
   * @param n The index of the desired Fibonacci number (must be positive).
   * @return The nth Fibonacci number.
   * @throws IllegalArgumentException if n is negative.
   */
  public static int getFibonacciNumber(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("n must be a positive number.");
    }

    int a = 0, b = 1, fib = 0;
    for (int i = 1; i < n; i++) {
      // Calculate the next Fibonacci number
      fib = a + b;
      // Update values for the next iteration
      a = b;
      b = fib;
    }
    return fib;
  }
}
