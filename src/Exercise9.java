import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Height: ");
        int height = in.nextInt();

        while (height < 1 || height > 24) {
            System.out.print("Height: ");
            height = in.nextInt();
        }

        in.close();

        String pyramidLevels = "";

        for (int i = 0; i < height; i++) {
            for (int k = height - i; k > 1; k--) {
                pyramidLevels += " ";
            }
            for (int j = -1; j <= i; j++) {
                pyramidLevels += "#";
            }
            for (int b = 0; b <1; b++) {
                pyramidLevels += " ";
            }
            for (int j = -1; j <= i; j++) {
                pyramidLevels += "#";
            }
            if (i < height - 1) {
                pyramidLevels += "\n";
            } else;
        }

        System.out.println("\n" + pyramidLevels);

    }
}
