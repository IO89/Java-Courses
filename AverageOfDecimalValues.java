import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageOfDecimalValues {

    public static void main(String[] args) {
        int count = 0;
        double value, sum = 0, average;
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number (zero ends):");
        value = readDouble(input);
        while (value != 0) {
            count++;
            sum += value;
            System.out.print("Enter next number (zero ends):");
            value = readDouble(input);
        }
        System.out.println();
        if (count == 0)
            System.out.println("Nothing to calculate");
        else {
            average = sum / count;
            System.out.println("The average is " + twoDecimals.format(average));
        }


        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}

