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
        int sum;
        if (index == 0) {
            sum = num0;
        } else if (index == 1) {
            sum = num1;
        } else {
            // 6 -> 8
            sum = num0 + num1;
            for (int i = 2; i < index; i++) {
                num0 = num1;
                num1 = sum;
                sum = num0 + num1;
            }
           
        }
        return sum;
    }
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..
        int index = getNumberInput("index: ");
        int result = getFibonacci(index);

        System.out.println("result: " + result);
    }
}