package mod8_TicTacToe.java.model;


public class Board {

    private Symbol[][] content;
    private static final int MAX_ROW = 3;
    private static final int MAX_COL = 3;


    {
        this.content = new Symbol[MAX_ROW][MAX_COL];
    }

    public void setCell(int row, int col, Symbol symbol) {
        content[row][col] = symbol;
    }

    public void showCurrentState() {
        System.out.println("--------");
        for (int i = 0; i < MAX_ROW; i++) {
            for (int j = 0; j < MAX_COL; j++) {
                System.out.print(content[i][j] != null ? content[i][j] : " ");
                if (j < MAX_COL - 1) System.out.print("|");
            }
            System.out.println();
            if (i < MAX_ROW - 1) System.out.println("--------");
        }
        System.out.println("--------");
    }


    public boolean isCellEmpty(int row, int column) {
        return content[row][column] == null;
    }

    public boolean isWinner(Player currentPlayer) {
        Symbol symb = currentPlayer.getSymbol();
        for (int i = 0; i < MAX_ROW; i++) {
            if (content[i][0] == symb && content[i][1] == symb && content[i][2] == symb) {
                return true;
            }
        }
        for (int j = 0; j < MAX_COL; j++) {
            if (content[0][j] == symb && content[1][j] == symb && content[2][j] == symb) {
                return true;
            }
        }
        if (content[0][0]==symb && content[1][1]==symb &&content[2][2]==symb) return true;
        if (content[0][2]==symb && content[1][1]==symb &&content[2][0]==symb) return true;
        return false;
    }
}
