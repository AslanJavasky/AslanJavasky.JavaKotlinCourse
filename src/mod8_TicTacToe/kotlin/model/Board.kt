package mod8_TicTacToe.kotlin.model

class Board {

    private val content = Array(3) { arrayOfNulls<Symbol>(3) }

    fun setCell(row:Int, column: Int, symbol:Symbol){
        content[row][column]=symbol
    }

    fun showCurrentState(){
        println("--------")
        for (i in 0 until MAX_ROW){
            for (j in 0 until MAX_COLUMN){
                print(content[i][j] ?: " ")
                if (j<2) print("|")
            }
            println()
            if (i<2) println("--------")
        }
        println("--------")
    }

    fun isCellEmpty(row:Int, column:Int)=
        content[row][column] == null

    fun isWinner(currentPlayer:Player):Boolean{
        val symb=currentPlayer.symbol

        for (i in 0 until 3){
            if (content[i][0]==symb &&content[i][1]==symb && content[i][2]==symb){
                return true
            }
        }
        for (j in 0 until 3){
            if (content[0][j]==symb &&content[1][j]==symb && content[2][j]==symb){
                return true
            }
        }
        if (content[0][0] == symb && content[1][1] == symb && content[2][2] == symb) return true
        if (content[0][2] == symb && content[1][1] == symb && content[2][0] == symb) return true
        return false

    }


    companion object{
        private const val MAX_ROW=3
        private const val MAX_COLUMN=3
    }
}