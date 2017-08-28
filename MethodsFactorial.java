public class MethodsFactorial {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static long factorial(long number) {
        if (number <= 1)
            return 1;
        else return number * factorial(number - 1);
    }
}
