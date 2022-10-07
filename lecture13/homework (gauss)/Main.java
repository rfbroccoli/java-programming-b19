import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static int getNumberInput(String prompt) {
        System.out.print(prompt);
        String stringInput = scanner.nextLine();
        int number = Integer.parseInt(stringInput);
        return number;
    }

    static int getSum(int start, int end) {
        // TODO put the sum of all numbers between start and end in result

        int result = 0;

        return result;
    }

    public static void main(String[] args) {
        int start = getNumberInput("start: ");
        int end = getNumberInput("end: ");
        int sum = getSum(start, end);

        System.out.println(start + " + ... + " + end + " = " + sum);
    }
}