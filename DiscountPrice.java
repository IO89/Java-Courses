
import java.text.DecimalFormat;
import java.util.Scanner;

public class DiscountPrice {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter original price: ");
        double originalPrice = readDouble(input);
        System.out.print("Enter discount percentage: ");
        double discountPrice = readDouble(input);
        double finalPrice = (originalPrice - (originalPrice * (discountPrice / 100)));

        System.out.println("\n" + "The final price is " + twoDecimals.format(finalPrice));
        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}