import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Lower bound: ");
        int lowerBound = in.nextInt();
        System.out.print("Upper bound: ");
        int upperBound = in.nextInt();

        while (upperBound < lowerBound) {
            System.out.print("Lower bound: ");
            lowerBound = in.nextInt();
            System.out.print("Upper bound: ");
            upperBound = in.nextInt();
        }

        in.close();

        int result = 0;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                result = result + i;
            }
        }

        System.out.printf("\n" + "%,d", result);
        System.out.println(".");
    }
}
