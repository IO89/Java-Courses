import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f, i, factorial = 1;
        try {
            System.out.print("Enter a non-negative integer: ");
            f = Integer.parseInt(input.nextLine());
            if (f == 0) {
                System.out.println("0! = 1");
            } else if (f < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else {
                for (i = 1; i <= f; i++) {
                    factorial = i * factorial;

                }
                System.out.println(f + "!= " + factorial);
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}

