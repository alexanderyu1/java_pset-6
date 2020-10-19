import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int integer = 1;
        int sumOfInts = 0;
        int numberOfInts = 0;

        while (integer > 0) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();

            if (integer >= 0) {
                sumOfInts = sumOfInts + integer;
                numberOfInts++;
            }
            else {
                break;
            }
        }

        double average = (double) sumOfInts / (numberOfInts);

        if (Double.isNaN(average)) {
            System.out.println("\nError: division by zero.");
        }
        else {
            System.out.printf("\n" + "%,.2f", average);
            System.out.println("");
        }
    }
}
