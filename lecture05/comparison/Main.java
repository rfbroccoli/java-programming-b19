public class Main {
    public static void main(String[] args) {
        char val1 = 'H';
        int val2 = 72;
        // int val1 = 423;
        // int val2 = 423;
        System.out.printf("val1: %c%n", val1);
        System.out.printf("val2: %d%n", val2);
        boolean val3 = val1 == val2;
        System.out.printf("val3: %b%n", val3);


        int ageOfLily = 18;
        boolean isNotUnderaged = ageOfLily >= 18;
        boolean isUnderaged = !isNotUnderaged;
        System.out.printf("isNotUnderaged: %b%n", isNotUnderaged);
        System.out.printf("isUnderaged: %b%n", isUnderaged);
    }
}