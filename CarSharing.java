import java.text.DecimalFormat;
import java.util.Scanner;

public class CarSharing {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter driven kilometers: ");
        int drivenKilometers = Integer.parseInt(input.nextLine());
        System.out.print("Enter fuel consumption per 100 km: ");
        double fuelConsumption = readDouble(input);
        System.out.print("Enter fuel price per liter: ");
        double priceForLiter = readDouble(input);
        System.out.print("Enter number of people: ");
        int numberOfPeople = Integer.parseInt(input.nextLine());

        double cost = (((fuelConsumption / 100) * priceForLiter * drivenKilometers) / numberOfPeople);
        System.out.println("\n" + "Each of the " + numberOfPeople + " people should pay " + twoDecimals.format(cost) + " euros.");


        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
