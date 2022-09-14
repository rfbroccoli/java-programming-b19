package assignment;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int num1 = 234;
        int num2 = 212;

        // num1 = num1 + 3;
        num1 += 3;
        System.out.println("num1 = num1 + 3");
        System.out.printf("num1 = %d%n", num1);

        // num2 = num2 - 6;
        num2 -= 6;
        System.out.println("num2 = num2 - 6");
        System.out.printf("num2 = %d%n", num2);

        num2 *= 2;
        System.out.println("num2 = num2 * 2");
        System.out.printf("num2 = %d%n", num2);

        num2 /= 2;
        System.out.println("num2 = num2 / 2");
        System.out.printf("num2 = %d%n", num2);

        int num3 = num1++;
        System.out.printf("num1 = %d%n", num1);
        System.out.printf("num3 = %d%n", num3);

        int num4 = ++num1;
        System.out.printf("num1 = %d%n", num1);
        System.out.printf("num4 = %d%n", num4);
    }
}