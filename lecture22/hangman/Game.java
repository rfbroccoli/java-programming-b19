import java.util.ArrayList;

public class Game {
    WordBank wordBank;
    String word;
    ArrayList<String> answerArray;
    UI ui;
    int lives;
    boolean isWon;

    public Game() {
        this.ui = new UI();
        this.wordBank = new WordBank();
        word = wordBank.getOneRandomWord();
        lives = 6;
        isWon = false;

        this.answerArray = new ArrayList<String>();

        for (int i = 0; i < word.length(); i++) {
            this.answerArray.add("_");
        }
    }

    boolean isGameOver() {
        if (this.lives == 0) {
            this.ui.printGameOver(isWon, word);
            return true;
        }
        for (int i = 0; i < word.length(); i++) {
            String letter = answerArray.get(i);
            if (letter == "_") {
                return false;
            }
        }
        this.ui.printGameOver(isWon, word);
        return true;
    }

    void start() {
        this.ui.welcome();
        System.out.println(word);

        while (!isGameOver()) {
            this.ui.printState(lives, answerArray);
            String input = this.ui.getStringInput("Choose a letter: ");
            boolean isCorrect = false;
            for (int i = 0; i < word.length(); i++) {
                char c = this.word.charAt(i);
                String letter = Character.toString(c);
                boolean isTheSame = letter.equals(input);
                if (isTheSame) {
                    answerArray.set(i, letter);
                    isCorrect = true;
                }
            }
            if (!isCorrect) {
                lives--;
            }
        }

    }

}