import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int getNumberInput(String prompt) {
        System.out.print(prompt);
        String stringInput = scanner.nextLine();
        int number = Integer.parseInt(stringInput);
        return number;
    }

    static int getLargestCommonDivsor(int largerNumber, int smallerNumber) {
        int remainder = largerNumber % smallerNumber;
        while (remainder != 0) {
            largerNumber = smallerNumber;
            smallerNumber = remainder;
            remainder = largerNumber % smallerNumber;
        }
        int largestCommonDivisor = smallerNumber;
        return largestCommonDivisor;

    }

    public static void main(String[] args) {
        int firstNumber = getNumberInput("First Number: ");
        int secondNumber = getNumberInput("Second Number: ");

        scanner.close();

        int largerNumber = Math.max(firstNumber, secondNumber);
        int smallerNumber = Math.min(firstNumber, secondNumber);

        int largestCommonDivisor = getLargestCommonDivsor(largerNumber, smallerNumber);

        System.out.println("largestCommonDivisor: " + largestCommonDivisor);
    }
}