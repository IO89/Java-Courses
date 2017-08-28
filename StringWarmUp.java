import java.util.Scanner;

public class StringWarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String text = input.nextLine();
        int textLength = text.length();
        String toUpperCase = text.toUpperCase();
        String toLowerCase = text.toUpperCase();
        System.out.println("\n" + textLength + " characters");
        System.out.println("\n" + toUpperCase);
        System.out.println("\n" + toLowerCase);

    }
}

