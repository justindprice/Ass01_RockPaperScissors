import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean validMove = false;
        boolean continuing = true;

        do {
            // Get Move for Player A
            do {
                System.out.print("Player A, enter your move [R, P, S]: ");
                playerA = in.nextLine();
                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                    validMove = false;
                }
            } while (!validMove);

            // Get Move for Player B
            do {
                System.out.print("Player B, enter your move [R, P, S]: ");
                playerB = in.nextLine();
                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Please enter R, P, or S.");
                    validMove = false;
                }
            } while (!validMove);

            // Determine Winner and Display Results
            // Using .equalsIgnoreCase() as required by the assignment notes
            if (playerA.equalsIgnoreCase(playerB)) {
                if (playerA.equalsIgnoreCase("R")) System.out.println("Rock vs Rock it’s a Tie!");
                else if (playerA.equalsIgnoreCase("P")) System.out.println("Paper vs Paper it’s a Tie!");
                else System.out.println("Scissors vs Scissors it’s a Tie!");
            }
            else if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                } else { // Player B is Paper
                    System.out.println("Paper covers Rock. Player B wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else { // Player B is Scissors
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            else { // Player A is Scissors
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                } else { // Player B is Rock
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
            }

            // Prompt to play again
            System.out.print("Do you want to play again? [Y/N]: ");
            playAgain = in.nextLine();
            if (playAgain.equalsIgnoreCase("N")) {
                continuing = false;
            }

        } while (continuing);

        System.out.println("Thanks for playing!");
    }
}