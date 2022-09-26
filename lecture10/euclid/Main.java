import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("First Number: ");
        String stringInput = scanner.nextLine();
        int firstNumber = Integer.parseInt(stringInput);
        System.out.print("Second Number: ");
        stringInput = scanner.nextLine();
        int secondNumber = Integer.parseInt(stringInput);

        scanner.close();

        int largerNumber = Math.max(firstNumber, secondNumber);
        int smallerNumber = Math.min(firstNumber, secondNumber);

   
        int remainder = largerNumber % smallerNumber;
        while (remainder != 0) {
            largerNumber = smallerNumber;
            smallerNumber = remainder;
            remainder = largerNumber % smallerNumber;
        }

        int largestCommonDivisor = smallerNumber;

        System.out.println("largestCommonDivisor: " + largestCommonDivisor);
    }
}