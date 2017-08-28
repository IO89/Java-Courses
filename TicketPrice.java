import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketPrice {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price for a single ticket: ");
        double singleTicket = readDouble(input);
        System.out.print("Enter price for a season ticket: ");
        double priceSeason = readDouble(input);
        System.out.print("Enter the number of bus trips per month: ");
        int tripsMonthly = Integer.parseInt(input.nextLine());

        double costSingleTicket = singleTicket * tripsMonthly;
        if (priceSeason < costSingleTicket) {
            System.out.println("\n" + "Buying a season ticket is " + twoDecimals.format(costSingleTicket - priceSeason) + " euros cheaper.");
        } else if (priceSeason == costSingleTicket) {
            System.out.println("\n" + "There is no difference in the price.");
        } else {
            System.out.println("\n" + "Buying  single tickets is " + twoDecimals.format(priceSeason - costSingleTicket) + " euros cheaper.");
        }


        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
