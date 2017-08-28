import java.util.Scanner;
import java.util.Arrays;

public class ArrayDescendingNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[4];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + (i + 1) + ". number: ");
            array[i] = readDouble(input);
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}




