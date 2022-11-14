import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class WordBank {

    private ArrayList<String> allWords = new ArrayList<String>();

    public ArrayList<String> getAllWords() {
        return this.allWords;
    }

    public String getOneRandomWord() {
        int index = (int) (Math.random() * this.allWords.size());
        return this.allWords.get(index).toUpperCase();
    }

    public WordBank() {
        // String fileName = "C:/Users/pwhbd/OneDrive/Desktop/java-programming-b19/lecture22/hangman";
        String fileName = "C:/Users/pwhbd/OneDrive/Desktop/java-programming-b19/lecture22/hangman/words.txt";
        Path path = Paths.get(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(path);

            while (scanner.hasNextLine()) {
                // process each line
                String line = scanner.nextLine();
                // System.out.println(line);
                this.allWords.add(line);
            }
            scanner.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
