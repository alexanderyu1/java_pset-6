import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height: ");
        int height = in.nextInt();

        while (height <= 0 || height > 24) {
            System.out.print("Height: ");
            height = in.nextInt();
        }

        in.close();

        int heightActual = height + 1;
        String[] pyramid = new String[heightActual];

        for (int i = 0; i < heightActual; i++) {
            pyramid[i] = "#";
        }

        System.out.println();
        int build = 2;

        for (int i = 1; i < height + 1; i++) {
            int spaces = height - build;

            for (int j = 0; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < build; k++) {
                System.out.print(pyramid[k]);
            }
            build++;

            System.out.println("");
        }
    }
}
