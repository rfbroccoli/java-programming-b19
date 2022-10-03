public class Main {
    public static void main(String[] args) {
        int myNumber = 43;
        System.out.println("myNumber outside if: " + myNumber);
        if (myNumber > 12) {
            myNumber++;
            System.out.println("myNumber inside if: " + myNumber);
            String myString = "Hello Students!";
            System.out.println("myString inside if: " + myString);
        }
        System.out.println("myNumber outside if: " + myNumber);
        // System.out.println("myString inside if :" + myString);

    }

}