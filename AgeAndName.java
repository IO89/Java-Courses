import java.util.Scanner;

public class AgeAndName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int Age = Integer.parseInt(input.nextLine());
        System.out.print("Enter your first name: ");
        String Name = input.nextLine();

        System.out.println("\n" + Name + ", " + Age + " years");
        input.close();
    }
}
