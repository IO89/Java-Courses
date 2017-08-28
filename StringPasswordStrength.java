

import java.util.Scanner;

public class StringPasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();
        if (validatePassword(password) == true) {
            System.out.println("ok");
        } else {
            System.out.println("not strong enough!");
        }

    }

    private static boolean validatePassword(String password) {
        boolean valid = false;

        if (password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[0-9].*") && password.matches(".*[A-Z].*") || password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[0-9].*") && password.matches(".*[_!@#$%^&*()=+`~|/?><,.';:].*") ||
                password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[_!@#$%^&*()=+`~|/?><,.';:].*") || password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*")) {
            return valid = true;
        } else {
            return valid = false;
        }
    }

}
