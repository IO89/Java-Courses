import java.util.Scanner;

public class RegExValidateSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        String size = input.nextLine();
        if (size.matches("XS|S|M|L|XL")) {
            System.out.println("\n" + "Ok");
        } else {
            System.out.println("\nInvalid size");
        }
    }
}

