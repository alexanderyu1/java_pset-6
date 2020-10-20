import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        while (integer < 1 || integer > 92) {

            System.out.print("Enter an integer: ");
            integer = in.nextInt();

        }

        in.close();

        int fibonacciA = 0;
        int fibonacciB = 1;
        int fibonacciC;


        for (int i = 2; i <= integer; i++) {
            fibonacciC = fibonacciA + fibonacciB;
            fibonacciB = fibonacciA;
            fibonacciA = fibonacciC;
        }

        System.out.println("\n" + fibonacciA + ".");
    }
}


