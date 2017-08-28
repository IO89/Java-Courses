import java.util.Scanner;

public class MethodsUseLibraryClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println(number + "!= " + MethodsLibrary.factorial(number));
    }
}

class MethodsLibrary {
    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else return number * factorial(number - 1);
    }
}

