import java.util.Scanner;

public class RegExVowelsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String vowels = input.nextLine();
        if (vowels.matches("^[aeyiuoåäöAEYIOUÅÄÖ]+")) {
            System.out.println("\n" + "Vowels only");
        } else {
            System.out.println("\nNot only vowels!");
        }
    }
}
