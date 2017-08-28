import java.text.DecimalFormat;
import java.util.Scanner;

public class AgentCommission {

    public static void main(String[] args) {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter selling price: ");
        double originalPrice = readDouble(input);
        double agentFee = originalPrice * 0.0344;
        int minimumFee = 2400;
        if (agentFee < 2400) {
            System.out.println("\n" + "The commission is " + twoDecimals.format(minimumFee) + " euros.");
        } else {
            System.out.println("\n" + "The commission is " + twoDecimals.format(agentFee) + " euros.");
        }

        input.close();
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
