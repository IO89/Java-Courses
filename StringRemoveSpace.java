import java.util.Scanner;

public class StringRemoveSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String Text = input.nextLine();
        removeExtraSpace(Text);


    }

    private static void removeExtraSpace(String Text) {
        String newText = Text.replaceAll("\\s+", " ");
        System.out.println('"' + newText + '"');


    }

}
