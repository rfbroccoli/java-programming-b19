package lecture07.conditional;

// com.example.app

public class Main {
    public static void main(String[] args) {

        int ageOfFoo = 43;
        // ageOfFoo -= 12;

        if (ageOfFoo < 5) {
            System.out.println("Foo is too young to go to school.");
        } else if (ageOfFoo < 17) {
            System.out.println("Foo can go to school.");
        } else if (ageOfFoo < 30) {
            System.out.println("Foo can go to university.");
        } else {
            System.out.println("Foo should be a graduate.");
        }

        System.out.println("Next Line");

        String myName = "broccoli";

        if (myName == "Turing") {
            System.out.println("Hello, Turing!");
        } else {
            System.out.println("You are not Turing!");
        }

        boolean isAtHome = false;

        if (isAtHome) {
            System.out.println("Foo is at home.");
        } else {
            System.out.println("Foo is not at home.");
        }

        // --- equivalent ---
        // if (myName == "Turing") {
        // System.out.println("Hello, Turing!");
        // }
        // if (myName != "Turing") {
        // System.out.println("You are not Turing!");
        // }
        // --- equivalent ---
    }
}
