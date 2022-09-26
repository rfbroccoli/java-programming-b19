
public class Main {
    public static void main(String[] args) {
        int firstNumber = 48;
        int secondNumber = 128;
        // int firstNumber = Integer.parseInt(args[0]);
        // int secondNumber = Integer.parseInt(args[1]);

        int largerNumber = Math.max(firstNumber, secondNumber);
        int smallerNumber = Math.min(firstNumber, secondNumber);

        // System.out.println("largerNumber: " + largerNumber);
        // System.out.println("smallerNumber: " + smallerNumber);
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