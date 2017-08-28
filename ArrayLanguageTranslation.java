import java.util.Scanner;

public class ArrayLanguageTranslation {
    public static void main(String[] args) {
        int i = 0;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        String[] finnishWords = {"lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "junna", "opettaja"};
        String[] englishWords = {"bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher"};
        System.out.print("Enter an English word: ");
        String word = input.nextLine();
        for (i = 0; i < englishWords.length; i++) {
            if (englishWords[i].equals(word)) {
                System.out.println("\n" + finnishWords[i]);
                found = true;
            }

        }
        if (found == false) {
            System.out.println("\n" + "Unknown word");
        }
    }

}

