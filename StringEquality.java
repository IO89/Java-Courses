import java.util.Scanner;

public class StringEquality {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();
        if (firstString.equals(secondString)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


        input.close();
    }

}
