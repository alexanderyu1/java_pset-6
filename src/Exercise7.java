import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        while (integer <= 0) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }

        String factors = "";
        String factor1 = "";
        String factor2 = "";



        in.close();

        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) {
                factor1 = String.valueOf(i);
                factor2 = String.valueOf(integer / i);

                if (!factors.contains(" " + factor1 + ",") && !factors.contains(" " + factor2 + ",")) {
                    factors += factor1 + ", " + factor2 + ", ";
                }
            }
        }

        String finalOutput = factors.substring(0, factors.length() - 2);

        finalOutput += ".";

        System.out.println("\n" + finalOutput);
    }
}
