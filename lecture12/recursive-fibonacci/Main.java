import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int getNumberInput(String prompt) {
        System.out.print(prompt);
        String stringInput = scanner.nextLine();
        int number = Integer.parseInt(stringInput);
        return number;
    }

    static int getFibonacci(int index) {
        int num0 = 0;
        int num1 = 1;

        if (index == 0) {
            return num0;
        }
        if (index == 1) {
            return num1;
        }
        // 6 -> 8
        return getFibonacci(index - 1) + getFibonacci(index - 2);

    }

    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..
        int index = getNumberInput("index: ");
        int result = getFibonacci(index);

        System.out.println("result: " + result);
    }
}