import java.util.Scanner;

public class RegExValidateStudentNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student number: ");
        String number = input.nextLine();
        if (number.matches("[0-9]{7}")) {
            System.out.println("\n" + "Ok");
        } else {
            System.out.println("\nInvalid student number");
        }
    }
}

