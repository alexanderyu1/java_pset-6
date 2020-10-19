import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = in.nextInt();

        while (integer <= 0){
            System.out.print("Enter an integer: ");
            integer = in.nextInt();
        }

        in.close();

        int[] arrayForFactors = new int[0];
        int size = 0;

        for (int i = integer; i > 0; i--){
            if (integer % i == 0) {
                int otherFactor = integer / i;

                if (size <= 0) {
                    size += 2;
                    arrayForFactors = new int[size];
                    arrayForFactors[0] = otherFactor;
                    arrayForFactors[1] = i;
                }
                else {
                    int[] tempArray = new int[size];
                    for (int j = 0; j < size; j++){
                        tempArray[j] = arrayForFactors[j];
                    }

                    size += 2;
                    arrayForFactors = new int[size];
                    for (int k = 0; k < size - 2; k++) {
                        arrayForFactors[k] = tempArray[k];
                    }
                    arrayForFactors[size - 2] = otherFactor;
                    arrayForFactors[size - 1] = i;
                }
            }
            else;
        }

        System.out.print("\n");
        for (int i = 0; i < (size/2); i++){
            if (i == (size/2) - 1){
                System.out.print(arrayForFactors[i] + ".");
            }
            else {
                System.out.print(arrayForFactors[i] + ", ");
            }
        }

        System.out.println("");
    }
}
