package mod8_TicTacToe.java.controller;

import mod8_TicTacToe.java.model.Board;
import mod8_TicTacToe.java.model.Player;
import mod8_TicTacToe.java.model.Symbol;

import java.util.Scanner;

public class GameController {
    Player player1;
    Player player2;
    Board board;

    {
        initPlayers();
    }

    public GameController() {
        board = new Board();
    }

    public void playGame() {
        Scanner in = new Scanner(System.in);
        Player currentPlayer = player1;
        while (true) {
            board.showCurrentState();
            System.out.println("Player " + currentPlayer.getName() + " enter your move(row and column)!");
            int row = 0, column = 0;
            System.out.println("row=");
            row = in.nextInt();
            System.out.println("column=");
            column = in.nextInt();
            row--;
            column--;

            if (board.isCellEmpty(row, column)) {
                board.setCell(row, column, currentPlayer.getSymbol());
                board.showCurrentState();
            }
            if (board.isWinner(currentPlayer)) {
                System.out.println("The player " + currentPlayer.getName() + " is win! GAME OVER!");
                break;
            } else {
                currentPlayer = (currentPlayer == player1 ? player2 : player1);
            }
        }
    }

    private void initPlayers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of Player 1: ");
        String player1Name = in.nextLine();
        do {
            System.out.println("Choose a symbol for Player " + player1Name + " (X or 0) : ");
            String symbol = in.nextLine();
            if (symbol.length() == 1) {
                if (symbol.equalsIgnoreCase("X") || symbol.equalsIgnoreCase("Х")) {
                    player1 = new Player(player1Name, Symbol.X);
                } else {
                    player1 = new Player(player1Name, Symbol.O);
                }
            }
        } while (player1 == null);

        System.out.println("Enter the name of Player 2: ");
        String player2Name = in.nextLine();
        if (player1.getSymbol() == Symbol.X) {
            player2 = new Player(player2Name, Symbol.O);
        } else {
            player2 = new Player(player2Name, Symbol.X);
        }
//        in.close();
    }
}
