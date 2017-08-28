import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();
        System.out.print("Enter secondString: ");
        String secondString = input.nextLine();
        if (isAnagram(firstString, secondString) == true) {
            System.out.println("Anagram!");
        } else {
            System.out.println("No Anagram.");
        }

    }

    private static boolean isAnagram(String firstString, String secondString) {
        boolean valid = false;
        if (firstString.matches("^[A-ZÅÄÖa-zåäö]+((\\s|\\.|,)*[A-ZÅÄÖa-zåäö]*)*$") && secondString.matches("^[A-ZÅÄÖa-zåäö]+((\\s|\\.|,)*[A-ZÅÄÖa-zåäö]*)*$")) {
            String firstLettersString = firstString.trim().replaceAll("(\\s|\\.|,)*", "").toLowerCase();
            String secondLettersString = secondString.trim().replaceAll("(\\s|\\.|,)*", "").toLowerCase();

            char[] firstCharArray = firstLettersString.toCharArray();
            char[] secondCharArray = secondLettersString.toCharArray();

            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            if (Arrays.equals(firstCharArray, secondCharArray)) {
                return valid = true;
            } else return valid = false;

        } else {
            return valid = false;
        }
    }

}
