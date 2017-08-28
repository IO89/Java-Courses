import java.text.DecimalFormat;
import java.util.Scanner;

public class DrivingCost {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter driven kilometers: ");
        int Kilometers = Integer.parseInt(input.nextLine());
        System.out.print("Enter amount of fuel consumed: ");
        double fuelConsumed = readDouble(input);
        System.out.print("Enter fuel price per liter: ");
        double price = readDouble(input);

        double costPerKilometer = (fuelConsumed*price)/Kilometers;


        System.out.println("\n" + "The cost per kilometer is " + twoDecimals.format(costPerKilometer) + " euros.");


        input.close();
    }
    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',','.'));
    }
}
