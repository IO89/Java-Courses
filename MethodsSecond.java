import java.util.Scanner;

public class MethodsSecond {

    public static void main(String[] args) {


        printRectangle();
    }

    private static void printRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = Integer.parseInt(input.nextLine());
        System.out.print("Enter height: ");
        int height = Integer.parseInt(input.nextLine());
        System.out.print("\n");
        for (int i = 1; i <= height; i++) {
            for (int x = 1; x <= width; x++) {
                System.out.print("x");
            }
            System.out.println();
        }


    }
}
