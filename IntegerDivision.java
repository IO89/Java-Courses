import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegerDivision {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = Integer.parseInt(input.nextLine());
        System.out.print("Enter divisor: ");
        int divisor = Integer.parseInt(input.nextLine());
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("\n" + dividend + "/" + divisor + " = " + quotient + ", the remainder is " + remainder);


        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
