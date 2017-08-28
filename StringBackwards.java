import java.util.Scanner;

public class StringBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        reverse(text);


    }

    private static void reverse(String text) {
        String reverseText = new StringBuffer(text).reverse().toString();
        System.out.println(reverseText);

    }

}
