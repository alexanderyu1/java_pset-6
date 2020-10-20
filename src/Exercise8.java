import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height: ");
        int height = in.nextInt();

        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in.nextInt();
        }

        in.close();

        System.out.println();

        for (int i = 0; i < height; i++) {
            for (int k = height - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = -1; j <= i; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
