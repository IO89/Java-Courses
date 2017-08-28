public class MethodsFirst {

    public static void main(String[] args) {
        printNumbers();
    }

    private static void printNumbers() {
        int i = 0;
        while (i < 50) {
            i = i + 2;
            System.out.print(i + " ");
        }

    }
}

