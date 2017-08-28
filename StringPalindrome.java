import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("No palindrome");
        }
    }

    private static boolean isPalindrome(String text) {
        boolean valid;
        if (text.matches("^(\")*+[A-ZÅÄÖa-zåäö]+((\\s|\\.|,|:|;|\\?|!|-|'|\")*[A-ZÅÄÖa-zåäö]*)*$")) {
            String textChar = text.trim().replaceAll("(\\s|\\.|,|:|;|\\?|!|-|'|\")*", "").toLowerCase();
            String reversedTextChar = new StringBuilder(textChar).reverse().toString();

            char[] forward = textChar.toCharArray();
            char[] backward = reversedTextChar.toCharArray();

            return valid = Arrays.equals(forward, backward);

        } else {
            return valid = false;
        }
    }
}

