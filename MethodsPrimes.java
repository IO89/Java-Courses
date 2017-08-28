public class MethodsPrimes {
    public static void main(String[] args) {
        for (int i = 1; i <= 71; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrime(int i) {
        int factors = 0;
        int x = 1;
        while (x <= i) {
            if (i % x == 0) {
                factors++;
            }
            x++;
        }
        return (factors == 2);
    }
}
