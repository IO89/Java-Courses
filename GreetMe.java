import java.util.Scanner;

public class GreetMe {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name +"!");
        input.close();


    }
}
