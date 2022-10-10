import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  static int getNumberInput(String prompt) {
    System.out.printf("%s: ", prompt);
    String inputString = scanner.nextLine();
    int number = Integer.parseInt(inputString);
    return number;
  }

  static void startGame() {
    System.out.println("WELCOME TO GUESS THE NUMBER!");
    System.out.println("----------------------------");
  }

  public static void main(String[] args) {
    int lower = 1;
    int upper = 100;
    int randomNumber = (int) (Math.random() * upper) + (lower);

    int lives = 5;
    // System.out.println(randomNumber);
    int yourNumber = 0;
    startGame();
    while (lives > 0) {

      System.out.printf("Lives: %d%n", lives);
      yourNumber = getNumberInput("Guess your number");
      if (yourNumber > randomNumber) {
        System.out.printf("Your number %d is greater than the hidden number.%n", yourNumber);
      } else if (yourNumber < randomNumber) {
        System.out.printf("Your number %d is lower than the hidden number.%n", yourNumber);
      } else {
        System.out.printf("Correct! Your number %d is the hidden number.%n%n", yourNumber);
        break;
      }
      System.out.println("");
      lives = lives - 1;
    }

    if (yourNumber == randomNumber) {
      System.out.println("You won!");
    } else {
      System.out.println("Game Over!");
      System.out.println("You lost!");
      System.out.printf("The hidden number is %s.%n", randomNumber);
    }
  }
}
