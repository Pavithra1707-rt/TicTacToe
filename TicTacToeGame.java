public class TicTacToeGame {

    private TicTacToe game = new TicTacToe(); // reuse UC6 + UC7
    private char currentPlayer = 'X'; // X = Human, O = Computer
    private boolean gameOver = false;

    public void startGame() {

        while (!gameOver) {

            System.out.println("\nCurrent Turn: " + currentPlayer);

            if (currentPlayer == 'X') {
                // Human move (you can connect Scanner input here)
                int row = (int)(Math.random() * 3); // placeholder
                int col = (int)(Math.random() * 3);

                if (!game.updateBoard(row, col, 'X')) {
                    continue; // retry same turn if invalid
                }

            } else {
                // Computer move (UC7)
                game.computerMove('O');
            }

            game.printBoard();

            // Check win
            if (checkWin(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            }
            // Check draw
            else if (checkDraw()) {
                System.out.println("It's a draw!");
                gameOver = true;
            }
            // Switch turn
            else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
    }

    // Check win conditions
    public boolean checkWin(char symbol) {
        char[][] b = game.board; // assume getter if private

        // Rows, Columns, Diagonals
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == symbol && b[i][1] == symbol && b[i][2] == symbol)
                return true;
            if (b[0][i] == symbol && b[1][i] == symbol && b[2][i] == symbol)
                return true;
        }

        if (b[0][0] == symbol && b[1][1] == symbol && b[2][2] == symbol)
            return true;
        if (b[0][2] == symbol && b[1][1] == symbol && b[2][0] == symbol)
            return true;

        return false;
    }

    // Check draw condition
    public boolean checkDraw() {
        char[][] b = game.board;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == ' ') {
                    return false; // still moves left
                }
            }
        }
        return true;
    }
}