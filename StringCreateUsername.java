import java.util.Scanner;

public class StringCreateUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter surname: ");
        String lastName = input.nextLine();
        createUsername(firstName, lastName);


    }

    private static void createUsername(String firstName, String lastName) {

        if (firstName.length() >= 2 && lastName.length() >= 3) {
            String fName = firstName.substring(0, 2);
            String lName = lastName.substring(0, 3);
            System.out.println(lName.toLowerCase() + fName.toLowerCase());
        } else {
            System.out.println("Not enough letters to create a username!");
        }

    }

}
