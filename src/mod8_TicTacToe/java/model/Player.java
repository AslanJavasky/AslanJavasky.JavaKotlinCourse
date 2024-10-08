package mod8_TicTacToe.java.model;


public class Player {
    private final String name;
    private final Symbol symbol;

    public Player(final String name, final mod8_TicTacToe.java.model.Symbol symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public mod8_TicTacToe.java.model.Symbol getSymbol() {
        return symbol;
    }
}
