import java.util.Scanner;

public class StringLettersAndDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = input.nextLine();
        int charCount = 0;
        int numbersCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                charCount = charCount + 1;
            }
            if (Character.isDigit(text.charAt(i))) {
                numbersCount = numbersCount + 1;
            }
        }
        System.out.print("\n" + charCount + " letter(s)" + "\n" + numbersCount + " digit(s)");


    }
}

