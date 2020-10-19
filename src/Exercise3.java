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

        int result = 0;
        String integerString = String.valueOf(integer);
        int integerLength = integerString.length();

        for (int i = 0; i < integerLength; i++) {
            String integerSection = integerString.substring(i, i + 1);
            int integerSectionInteger = Integer.parseInt(integerSection);

            if (integerSectionInteger % 2 != 0) {
                result += integerSectionInteger;
            }
        }

        System.out.println("\n" + result + ".");
    }
}
