import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer= 0;
        int input;
        do {
            System.out.print("Enter an integer: ");
            input = in.nextInt();
        } while (input < 0);

        in.close();

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                integer = i;
                break;
            }
        }

        if (integer != 0) {
            System.out.println("\nNot prime.");
        } else {
            System.out.println("\nPrime.");
        }
    }
}
