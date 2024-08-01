import java.util.Scanner;

public class NumberConversion {

    // Method to convert integer to binary string
    public static String intToBinary(int number) {
        return Integer.toBinaryString(number);
    }

    // Method to convert binary string to integer
    public static int binaryToInt(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer to binary conversion
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        String binaryString = intToBinary(number);
        System.out.println("Binary representation of " + number + " is: " + binaryString);

        // Binary to integer conversion
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();
        int intValue = binaryToInt(binaryInput);
        System.out.println("Integer representation of binary " + binaryInput + " is: " + intValue);

        scanner.close();
    }
}
