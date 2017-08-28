import java.util.Scanner;

public class RegExValidateUsernameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        if (userName.matches("[a][0-9]{7}[@][a-z]{5}[-][a-z]{5}[.][a-z]{2}")) {
            System.out.println("\n" + "Ok");
        } else {
            System.out.println("\nInvalid username format");
        }
    }
}

