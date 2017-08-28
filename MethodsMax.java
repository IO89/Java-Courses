import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsMax {

    public static void main(String[] args) {

        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double a = readDouble(input);
        System.out.print("Enter second double: ");
        double b = readDouble(input);
        max(a, b);


    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

    private static void max(double a, double b) {
        //DecimalFormat twoDecimals = new DecimalFormat("0.00");
        if (a > b) {
            System.out.println("\n" + "the max value is " + a);
        } else if (a == b) {
            System.out.println("\n" + "the max value is " + a);
        } else {
            System.out.println("\n" + "The maxvalue is " + b);
        }
    }
}





