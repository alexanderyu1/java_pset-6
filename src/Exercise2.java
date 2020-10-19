import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        while (integer <= 0) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }

        in.close();

        String integerString = Integer.toString(integer);
        int integerStringLength = integerString.length();

        System.out.print("\n");
        for (int i = integerStringLength - 1; i > 0; i--) {
            String integerSection = integerString.substring(i, i + 1);
            System.out.print(integerSection + ", ");
        }

        System.out.println(integerString.substring(0, 1) + ".");
    }
}
