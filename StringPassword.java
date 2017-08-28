import java.util.Scanner;

public class StringPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = input.nextLine();
        System.out.print("Enter password: ");
        String passwrod = input.nextLine();
        if (validatePassword(userName, passwrod) == true) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }

    }

    private static boolean validatePassword(String userName, String password) {
        boolean valid = false;

        if (password.length() < 8 || password.toLowerCase().contains(userName.toLowerCase())) {
            return valid = false;
        } else {
            return valid = true;
        }
    }

}


