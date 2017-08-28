import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {

    public static void main(String[] args) {

        printNetSalary();


    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

    private static void printNetSalary() {
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter gross salary: ");
        double grossSalary = readDouble(input);
        System.out.print("Enter income tax rate: ");
        double incomeTax = readDouble(input);
        double result = grossSalary - (grossSalary * (incomeTax / 100));
        System.out.println("\n" + "The net salary is " + twoDecimals.format(result));
    }

}

