import java.util.Scanner;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int First = Integer.parseInt(input.nextLine());
        System.out.print("Enter second integer: ");
        int Second = Integer.parseInt(input.nextLine());
        System.out.println(First + "+" + Second + "= " + (First + Second));
        input.close();
    }
}

