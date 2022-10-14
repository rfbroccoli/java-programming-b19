import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static String ROCK = "ROCK";
    static String PAPER = "PAPER";
    static String SCISSORS = "SCISSORS";
    static String[] moves = { ROCK, PAPER, SCISSORS };

    static String getStringInput() {
        System.out.print("Choose your move from [R]ock, [P]aper or [S]cissors: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }

    static String getMoveFromString(String string) {
        switch (string) {
            case "R":
                return ROCK;
            case "P":
                return PAPER;
            case "S":
                return SCISSORS;
            default:
                System.out.println("Invalid Input.");
                String userMoveString = getStringInput();
                String userMove = getMoveFromString(userMoveString);
                return userMove;
        }
    }

    static String getComputerMove() {
        int randomIndex = (int) (Math.random() * moves.length);
        String computerMove = moves[randomIndex];
        return computerMove;
    }

    static void startGame() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        startGame();

        String userMoveString = getStringInput();
        String userMove = getMoveFromString(userMoveString);
        System.out.println();
        String computerMove = getComputerMove();
        System.out.println("YOU: " + userMove + " Vs. " + "CPU: " + computerMove);

        // if (userMove == SCISSORS && computerMove == PAPER) {
        // System.out.println("You won!");
        // }

        // if (userMove == computerMove) {
        // System.out.println("Draw!");
        // } else if (userMove == ROCK && computerMove == SCISSORS) {
        // System.out.println("You won!");
        // } else if (userMove == PAPER && computerMove == ROCK) {
        // System.out.println("You won!");
        // } else if (userMove == SCISSORS && computerMove == PAPER) {
        // System.out.println("You won!");
        // }

        if (userMove == computerMove) {
            System.out.println("Draw!");
        } else if ((userMove == ROCK && computerMove == SCISSORS) || (userMove == PAPER && computerMove == ROCK)
                || userMove == SCISSORS && computerMove == PAPER) {
            // if (A OR B OR C) { do something }
            System.out.println("You won!");
        }

        // TODO add another conditional code block to print "You lost!"
    }
}