public class TicTacToeClass {
    // Instance Variables
    private char[][] board;
    private int turns;

    // Constructors
    public TicTacToeClass() {
        board = new char[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    // Accessor Methods

	// returns true if the letter passed in currently has three in a row. That is,
    // isWinner('X') will return true if X has won, and isWinner('O') will return true if O has won
    public boolean isWinner(char p) {
        
        if ( board[0][0] == p && board[1][0] == p && board[2][0] == p) {
            return true;
        } else if (board[0][1] == p && board[1][1] == p && board[2][1] == p) {
            return true;
        } else if (board[0][2] == p && board[1][2] == p && board[2][2] == p) {
            return true;
        } else if (board[0][0] == p && board[0][1] == p && board[0][2] == p) {
            return true;
        } else if (board[1][0] == p && board[1][1] == p && board[1][2] == p) {
            return true;
        } else if (board[2][0] == p && board[2][1] == p && board[2][2] == p) {
            return true;
        } else if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
            return true;
        } else if (board[0][2] == p && board[1][1] == p && board[2][0] == p) {
            return true;
        } else {
            return false;
        }
	}
	
   // returns true if nine turns have been played and false otherwise
    public boolean isFull() {
        
        if (turns == 9) {
            return true;
        } else {
            return false;
        }
    }
	
	// returns true if all nine spaces are filled AND neither X nor O has won
    public boolean isCat() {
        if ( !isWinner('X') && !isWinner('O')&& isFull()) {
            return true;
        } else {
            return false;
        }
	}
	
	 // returns true if the given row and column corresponds to a valid space on the board
    public boolean isValid(int r, int c) {
       
        

        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            return true;
        else
            return false;
    }

	// returns the numbers of turns played so far
    public int numTurns() {
        return turns;
    }

	// returns the character representing the piece at the given location. Should return either ' ', 'X', or 'O'.
    public char playerAt(int r, int c) {
        
        if (isValid(r, c))
            return board[r][c];
        else
            return '@';
    }

	 // displays the current board on the screen
    public void displayBoard() {
       

        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

	// Modifiers
	
	// allows the given player to place their move at the given row and column. 
    // The row and column numbers are 0-based, so valid numbers are 0, 1, or 2
    public void playMove(char p, int r, int c) {
      
	{
        board[r][c] = p;
        turns++;
	}
  } 

}