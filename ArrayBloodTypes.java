import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class ArrayBloodTypes {
    public static void main(String[] args) {
        DecimalFormat oneDecimals = new DecimalFormat("0.0");
        double count = 0;
        String[] bloodType = {"A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter blood type: ");
        String bType = input.nextLine();
        for (int i = 0; i < bloodType.length; i++) {
            if (bType.equalsIgnoreCase(bloodType[i])) {
                count = count + 1;
            }
        }

        double result = (count / bloodType.length) * 100;
        System.out.println("\n" + oneDecimals.format(result) + " %");
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
