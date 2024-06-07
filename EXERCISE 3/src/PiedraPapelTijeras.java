import java.util.List;
import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1Wins = 0;
        int player2Wins = 0;
        System.out.println("Enter 'r' for rock, 'p' for paper, or 's' for scissors.");
        System.out.println("Enter 'end' to finish the game");
        while (true) {
            System.out.print("Player 1: ");
            String play1 = scanner.nextLine().toLowerCase();

            if (play1.equals("end")) {
                break;
            }
            System.out.print("Player 2: ");
            String play2 = scanner.nextLine().toLowerCase();

            if (play2.equals("end")) {
                break;
            }
            if (play1.equals(play2)) {
                System.out.println("Tie!");
            } else if ((play1.equals("r") && play2.equals("s")) ||
                    (play1.equals("p") && play2.equals("r")) ||
                    (play1.equals("s") && play2.equals("p"))) {
                System.out.println("Player 1 won!");
                player1Wins++;
            } else if ((play2.equals("r") && play1.equals("s")) ||
                    (play2.equals("p") && play1.equals("r")) ||
                    (play2.equals("s") && play1.equals("p"))) {
                System.out.println("Player 2 won!");
                player2Wins++;
            } else {
                System.out.println("Invalid input. Please enter 'r', 'p', or 's'.");
            }
        }

        System.out.println("Player 1 won " + player1Wins + " times.");
        System.out.println("Player 2 won " + player2Wins + " times.");

        if (player1Wins > player2Wins) {
            System.out.println("Player 1 won the game!");
        } else if (player1Wins < player2Wins) {
            System.out.println("Player 2 won the game!");
        } else {
            System.out.println("Player 1 and Player 2 tied!");
        }

        scanner.close();
    }
    public static String calcularGanador(List<String[]> jugadas) {
        int player1Wins = 0;
        int player2Wins = 0;

        for (String[] jugada : jugadas) {
            String play1 = jugada[0].toUpperCase();
            String play2 = jugada[1].toUpperCase();

            if (play1.equals(play2)) {
                // Es un empate, no se cuenta nada
            } else if ((play1.equals("R") && play2.equals("S")) ||
                    (play1.equals("P") && play2.equals("R")) ||
                    (play1.equals("S") && play2.equals("P"))) {
                player1Wins++;
            } else if ((play2.equals("R") && play1.equals("S")) ||
                    (play2.equals("P") && play1.equals("R")) ||
                    (play2.equals("S") && play1.equals("P"))) {
                player2Wins++;
            } else {
                throw new IllegalArgumentException("Entrada inválida en la jugada: " + play1 + ", " + play2);
            }
        }
        if (player1Wins > player2Wins) {
            return "Player 1";
        } else if (player1Wins < player2Wins) {
            return "Player 2";
        } else {
            return "Tie";
        }
    }
}
