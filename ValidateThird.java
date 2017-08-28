import java.util.Scanner;

public class ValidateThird {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;

        do {
            System.out.print("Enter grade (0-5): ");
            String field = input.nextLine();
            try {
                int x = Integer.parseInt(field);
                if (x > 0 && x <= 5) {
                    System.out.println("OK");
                    valid = true;
                } else {
                    System.out.println("\n" + x + " is not a valid grade.");
                    //System.out.print("Enter grade (0-5): ");
                    //valid = false;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("\n" + field + " is not a valid grade.");
                //System.out.print("Enter grade (0-5): ");
            }
        }

        while (!valid);
        input.close();
    }
}
