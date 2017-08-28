import java.text.DecimalFormat;
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial deposit: ");
        double initialDeposit = readDouble(input);
        System.out.print("Enter interest rate: ");
        double interestRate = readDouble(input);
        System.out.print("Enter capital income tax rate: ");
        double capitalIncome = readDouble(input);
        System.out.print("Enter number of years: ");
        int years = Integer.parseInt(input.nextLine());
        interestRate = interestRate / 100;
        capitalIncome = 1 - (capitalIncome / 100);
        for (int i = 1; i <= years; i++) {
            double amount = initialDeposit * (Math.pow(1 + (interestRate * capitalIncome), i));
            System.out.println(i + ": " + twoDecimals.format(amount));
        }


        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
