import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        int count = 0;
        String value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string:");
        value = input.nextLine();
        while (!value.equals("quit")) {
            count += value.length();
            System.out.print("Enter a string: ");
            value = input.nextLine();
        }
        System.out.println();
        if (count == 0)
            System.out.println("Nothing to show");
        else {

            System.out.println("The total length is " + count);
        }


        input.close();
    }

}
