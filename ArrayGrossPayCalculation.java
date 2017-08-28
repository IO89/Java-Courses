import java.util.Scanner;
import java.text.DecimalFormat;

public class ArrayGrossPayCalculation {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        double totalPay = 0;
        int sumHours = 0;
        System.out.print("Enter your hourly wage: ");
        double hourlyWage = readDouble(input);

        System.out.print("Enter the number of days: ");
        int numberOfDays = Integer.parseInt(input.nextLine());
        int[] days = new int[numberOfDays];

        for (int i = 0; i < days.length; i++) {
            System.out.print("Hours worked on day " + (i + 1) + ": ");
            days[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < days.length; i++) {
            sumHours = sumHours + days[i];
        }
        System.out.println("\n" + "Total work hours is " + sumHours);
        for (int i = 0; i < days.length; i++) {
            if (days[i] <= 8) {
                totalPay += hourlyWage * days[i];
            } else {
                totalPay += (8 * hourlyWage) + ((days[i] - 8)) * (hourlyWage * 1.5);
            }
        }
        System.out.println("Gross pay is " + twoDecimals.format(totalPay));
        System.out.print("\n" + "You entered the following daily hours: ");
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

}
