import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        while (integer <= 0) {
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }

        in.close();

        String integerToString = Integer.toString(integer);
        int integerStringLength = integerToString.length();

        int result = 0;

        for (int i = 0; i < integerStringLength; i++) {
            String integerCharToString = String.valueOf(integerToString.charAt(i));
            double doubleOfThisChar = (Integer.parseInt(integerCharToString) / 2);

            if (((doubleOfThisChar) / 2) != (int)((doubleOfThisChar) / 2)) {
                result = result + Integer.parseInt(integerCharToString);
            }
        }

        System.out.print(result);
    }
}
