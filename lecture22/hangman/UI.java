import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    Scanner scanner;

    public UI() {
        this.scanner = new Scanner(System.in);
    }

    public void welcome() {
        System.out.println("Welcome to Hangman!");
    }

    public void printGameOver(boolean isWon, String word) {
        if (isWon) {
            System.out.println("You win! :D");
        } else {
            System.out.println(getState(0));
            System.out.println("You lost! :(");
        }
        System.out.println("The word is '" + word + "'.");
    }

    public void printState(int lives, ArrayList<String> answeArray) {
        System.out.println(getState(lives));

        for (int i = 0; i < answeArray.size(); i++) {
            System.out.print(answeArray.get(i) + " ");
        }
        System.out.println();
    }

    public String getStringInput(String prompt) {
        System.out.print(prompt);
        String input = this.scanner.nextLine();
        return input.toUpperCase();
    }

    private String getState(int lives) {
        switch (lives) {
            case 6:
                return """
                          +---+
                          |   |
                              |
                              |
                              |
                              |
                        =========
                              """;
            case 5:
                return """
                          +---+
                          |   |
                          O   |
                              |
                              |
                              |
                        =========
                              """;
            case 4:
                return """
                          +---+
                          |   |
                          O   |
                          |   |
                              |
                              |
                        =========
                              """;
            case 3:
                return """
                          +---+
                          |   |
                          O   |
                         /|   |
                              |
                              |
                        =========
                              """;
            case 2:
                return """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                              |
                              |
                        =========
                              """;
            case 1:
                return """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                         /    |
                              |
                        =========
                              """;
            default:
                return """
                          +---+
                          |   |
                          O   |
                         /|\\  |
                         / \\  |
                              |
                        =========
                              """;
        }
    }
}
