public class Main {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i++) {
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i);
        // }

        // int age = 10;

        // while (age < 18) {
        // if (age < 12) {
        // // break;
        // }
        // System.out.println("You're only " + age + ". You can't drink yet.");
        // age++;
        // }

        int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}