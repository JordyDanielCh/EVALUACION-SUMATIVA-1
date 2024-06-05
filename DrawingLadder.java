import java.util.Scanner;

public class DrawingLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER DE NUMBER OF LADDER: ");
        int numLadder = scanner.nextInt();
        if (numLadder > 0) {
            for (int i = 1; i <= numLadder; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("!");
                    System.out.print("_");
                }
                System.out.println();
            }
        } else if (numLadder < 0) {
            numLadder = Math.abs(numLadder);
            for (int i = numLadder; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("!");
                    System.out.print("_");
                }
                System.out.println();
            }
        } else {
            System.out.println("__");
        }
    }
}

