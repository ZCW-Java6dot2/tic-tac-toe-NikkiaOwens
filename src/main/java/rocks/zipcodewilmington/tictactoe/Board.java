package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;

    }


    // }
   /* public  Boolean row1X() {
        Boolean result = true;
        for (Integer i = 0; i <= board.length; i++) {
            if (board[0][i] == 'X') {
                i++;
            }
            else if(i == 3) {
                result = true;
            }
            else if( i != 3) {
                result = false;
            }


        }
        return result;

    }

    */
    public Boolean isInFavorOfX() {
        // check all rows, all columns, 2 diagnals, make all these methods
        // board[0][0]
        Boolean result = false;
        for (Integer row = 0; row < board.length; row++) {
            if (board[row][0] == 'X' && board[row][0] == board[row][1] && board[row][1] == board[row][2])
                result = true;
            else if (board[0][row] == 'X' && board[0][row] == board[1][row] && board[1][row] == board[2][row])
                result = true;
            else if (board[0][0] == 'X' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                result = true;
            else if (board[0][2] == 'X' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
                result = true;
            else if (board[2][0] == 'X' && board[2][0] == board[2][1] && board[2][1] == board[2][2])
                result = true;
            else if (board[0][2] == 'X' && board[0][2] == board[1][2] && board[1][2] == board[2][2])
                result = true;
            else if (board[1][0] == 'X' && board[1][0] == board[1][1] && board[1][1] == board[1][2])
                result = true;
            else
                break;
        }


        return result;


    }


    public Boolean isInFavorOfO() {

        // check all rows, all columns, 2 diagnals, make all these methods
        // board[0][0]
        Boolean result = false;
        for (Integer row = 0; row < board.length; row++) {
            if (board[row][0] == 'O' && board[row][0] == board[row][1] && board[row][1] == board[row][2])
                result = true;
            else if (board[0][row] == 'O' && board[0][row] == board[1][row] && board[1][row] == board[2][row])
                result = true;
            else if (board[0][0] == 'O' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                result = true;
            else if (board[0][2] == 'O' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
                result = true;
             else if (board[0][1] == 'O' && board[0][1] == board[1][1] && board[1][1] == board[2][1])
                 result = true;
            else if (board[2][0] == 'O' && board[2][0] == board[2][1] && board[2][1] == board[2][2])
                result = true;
            else
                break;
        }


        return result;

    }

    public Boolean isTie() {
        if (this.isInFavorOfO() == false && this.isInFavorOfX() == false)
            return true;
        else
            return false;
    }

    public String getWinner() {
        String result = "";
        if (this.isInFavorOfO() == false && this.isInFavorOfX() == true)
            result = "X";
        else if (this.isInFavorOfO() == true && this.isInFavorOfX() == false)
            result = "O";
        else if (this.isInFavorOfO() == false && this.isInFavorOfX() == false)
            result = "";
        return result;
    }

}

