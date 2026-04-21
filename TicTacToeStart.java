import java.util.Random;

public class TicTacToeStart {

    public static void main(String[] args) {

        Random rand = new Random();

        // Generate random number (0 or 1)
        int toss = rand.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol, player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Conditional logic based on toss
        if (toss == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentSymbol = player1Symbol;
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentSymbol = player2Symbol;
        }

        // Display results
        System.out.println("Toss Result: " + toss);
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Starting Player: " + currentPlayer);
        System.out.println("Starting Symbol: " + currentSymbol);
    }
}