package rock_paper_scissors;

public class Player {
    private String name;
    private Move move;

    public Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    Move getMove() {
        return this.move;
    }

    void setMove(Move move) {
        this.move = move;
    }

}
