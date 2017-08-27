import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalPlaces {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double Number = readDouble(input);

        System.out.println("\n" + twoDecimals.format(Number));
        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
