import java.util.Scanner;

public class StringDecimalPartLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        //double text =readDouble(input);
        String decimalText = input.nextLine();
        int i = decimalText.lastIndexOf('.');
        int j = decimalText.lastIndexOf(',');
        if (i != -1 && decimalText.matches("^([0-9]+)(,|\\.)[0-9]*") && decimalText.substring(i + 1).length() >= 1) {
            int result = decimalText.substring(i + 1).length();
            System.out.println("\n" + (result) + " decimal place(s)");
        } else if (j != -1 && decimalText.matches("^([0-9]+)(,|\\.)[0-9]*") && decimalText.substring(j + 1).length() >= 1) {
            int result = decimalText.substring(j + 1).length();
            System.out.println("\n" + (result) + " decimal place(s)");
        } else {
            System.out.println("Please enter a proper decimal number");
        }
    }

}
