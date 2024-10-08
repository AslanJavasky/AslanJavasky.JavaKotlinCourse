package mod8_TicTacToe.kotlin.controller

import mod8_TicTacToe.kotlin.model.Board
import mod8_TicTacToe.kotlin.model.Player
import mod8_TicTacToe.kotlin.model.Symbol

class GameController {

    private lateinit var player1: Player
    private lateinit var player2: Player
    private val board = Board()

    init {
        initPlayer()
    }

    fun playGame(){
        var currentPlayer=player1
        while (true){
            board.showCurrentState()
            println("Player ${currentPlayer.name}, enter your move(row and column)!")
            var row = 0
            var column = 0
            println("row=")
            row = readLine()!!.toInt() -1
            println("column=")
            column =  readLine()!!.toInt() -1
            if (board.isCellEmpty(row, column)) {
                board.setCell(row, column, currentPlayer.symbol)
                board.showCurrentState()
            }
            if (board.isWinner(currentPlayer)) {
                println("The player ${currentPlayer.name} is win! GAME OVER!")
                break
            } else {
                currentPlayer = (if (currentPlayer === player1) player2 else player1)
            }
        }
    }


    private fun initPlayer() {
        println("Enter the name of Player 1: ")
        val namePlayer1 = readln()
        println("Choose a symbol for Player $namePlayer1 (X or O): ")
        val symbolfromConsole = readln().uppercase()
        val symbol = when (symbolfromConsole) {
            "X", "Х" -> Symbol.X
            else -> Symbol.O
        }
        player1=Player(namePlayer1,symbol)
        println("Enter the name of Player 2: ")
        val namePlayer2 = readln()
        player2=Player(namePlayer2,if (player1.symbol==Symbol.X) Symbol.O else Symbol.X)


    }
}