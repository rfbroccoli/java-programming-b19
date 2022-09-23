public class Main {
    public static void main(String[] args) {
        int[] numbers = { 12, 64, 23, 13, 46, 251, 76 };
        int largestNumber = numbers[0];
        int index = 1; 

        while (index < numbers.length) {
            if (numbers[index] > largestNumber) {
                largestNumber = numbers[index];
            }
            index++;
        }

        System.out.println(largestNumber);
    }
}