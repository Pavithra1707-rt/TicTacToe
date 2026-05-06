import java.util.Random;

public class TicTacToe {

    private char[][] board = new char[3][3];
    private Random rand = new Random();

    public TicTacToe() {
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Reuse from UC6
    public boolean updateBoard(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ');
    }

    // UC7: Computer Move
    public void computerMove(char symbol) {
        int slot, row, col;

        while (true) {
            slot = rand.nextInt(9) + 1; // 1–9

            // Convert slot to row & col
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Try placing move
            if (updateBoard(row, col, symbol)) {
                System.out.println("Computer chose slot: " + slot);
                break; // exit loop once valid move is made
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }
}