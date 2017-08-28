import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {
        int count = 0;
        String value;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string (empty string to quit):");
        value = input.nextLine();
        while (!value.equals("")) {
            count++;
            System.out.print("Enter next string (empty string to quit):");
            value = input.nextLine();
        }
        System.out.println();
        if (count == 0)
            System.out.println("Nothing to show");
        else {

            System.out.println("Total number of entered strings are " + count);
        }


        input.close();
    }

}
