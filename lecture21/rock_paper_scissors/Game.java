package rock_paper_scissors;

import java.util.Scanner;

enum Move {
    ROCK,
    PAPER,
    SCISSORS
}

public class Game {
    Scanner scanner;
    boolean isGameEnded;
    Move[] moves = { Move.ROCK, Move.PAPER, Move.SCISSORS };

    public Game() {
        this.scanner = new Scanner(System.in);
        this.isGameEnded = false;
    }

    private String getStringInput(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return input.toUpperCase();
    }

    private Move getComputerMove() {
        int randomIndex = (int) (Math.random() * moves.length);
        Move computerMove = moves[randomIndex];
        return computerMove;
    }

    private Move getMoveFromString(String string) {
        switch (string) {
            case "R":
                return Move.ROCK;
            case "P":
                return Move.PAPER;
            case "S":
                return Move.SCISSORS;
            default:
                System.out.println("Invalid Input.");
                String userMoveString = this.getStringInput("Choose your move from [R]ock, [P]aper or [S]cissors: ");
                Move userMove = getMoveFromString(userMoveString);
                return userMove;
        }
    }

    private boolean getIsGameEnded(String string) {
        switch (string) {
            case "Y":
                return false;
            case "N":
                return true;
            default:
                System.out.println("Invalid Input.");
                String userMoveString = this.getStringInput("Contine playing? [Y]es or [N]o: ");
                boolean input = getIsGameEnded(userMoveString);
                return input;
        }
    }

    private void displayResult(Player user, Player computer) {
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println(
                user.getName() + " " + user.getMove() + " vs " + computer.getName() + " " + computer.getMove());
        if (userMove == computerMove) {
            System.out.println("Draw!");
        } else if ((userMove == Move.ROCK && computerMove == Move.SCISSORS)
                || (userMove == Move.PAPER && computerMove == Move.ROCK)
                || userMove == Move.SCISSORS && computerMove == Move.PAPER) {
            // if (A OR B OR C) { do something }
            System.out.println(user.getName() + " won!");
        } else {
            System.out.println(user.getName() + " lost!");
        }
    
    }

    void startGame() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("---------------------------------");

        while (!this.isGameEnded) {
            String input = this.getStringInput("Choose your move from [R]ock, [P]aper or [S]cissors: ");
            Player user = new User();
            Player computer = new Computer();
            user.setMove(getMoveFromString(input));
            computer.setMove(getComputerMove());
            displayResult(user, computer);

            input = this.getStringInput("Contine playing? [Y]es or [N]o: ");
            isGameEnded = this.getIsGameEnded(input);
            System.out.println();
        }
    }

}
