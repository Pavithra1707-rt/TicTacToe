public class TicTacToe {

    // 3x3 board
    private char[][] board = new char[3][3];

    // Constructor to initialize board
    public TicTacToe() {
        initializeBoard();
    }

    // Initialize board with empty spaces
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Reusable method to update board
    public boolean updateBoard(int row, int col, char symbol) {
        // Check if move is valid
        if (isValidMove(row, col)) {
            board[row][col] = symbol; // State update
            return true;
        } else {
            System.out.println("Invalid move! Try again.");
            return false;
        }
    }

    // Validate move
    public boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ');
    }

    // Display board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }
}