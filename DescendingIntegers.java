import java.util.Scanner;

public class DescendingIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(input.nextLine());


        for (int i = number; i >= 1; i--) {

            System.out.print(i + " ");
        }


        input.close();
    }

}
