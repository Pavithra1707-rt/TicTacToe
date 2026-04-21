import java.util.Scanner;

public class TicTacToeInput {

    // Method to get slot input from user
    public static int getUserSlot() {
        Scanner sc = new Scanner(System.in);
        int slot;

        System.out.print("Enter a slot number (1-9): ");
        slot = sc.nextInt();   // Read integer input

        return slot;           // Return the slot value
    }

    public static void main(String[] args) {

        int chosenSlot = getUserSlot();  // Method call

        System.out.println("You selected slot: " + chosenSlot);
    }
}