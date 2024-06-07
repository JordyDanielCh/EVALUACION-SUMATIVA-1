import java.util.Scanner;
public class step {
    public static void drawLadder(int steps) {
        if (steps == 0) {
            System.out.println("__");
        } else if (steps > 0) {
            for (int i = 0; i < steps; i++) {
                for (int j = 0; j < (steps - i - 1) * 2; j++) {
                    System.out.print(" ");
                }
                System.out.println(" _|");
            }
        } else {
            for (int i = 0; i < -steps; i++) {
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("|_");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of steps:");
        int steps = scanner.nextInt();
        drawLadder(steps);
    }
}
