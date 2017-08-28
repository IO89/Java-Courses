import java.util.Scanner;

public class ArrayElection {
    public static void main(String[] args) {
        int maxSoFar = 0;
        int index1 = 0;
        int index2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of candidates: ");
        int numberOfCandidates = Integer.parseInt(input.nextLine());
        String[] arrayNameOfCandidates = new String[numberOfCandidates];//Created an array for name of candidates
        int[] arrayVotesOfCandidates = new int[numberOfCandidates];//Created an array for number of votes
        for (int i = 0; i < arrayNameOfCandidates.length; i++) {
            System.out.print("Enter " + (i + 1) + ". name: ");
            arrayNameOfCandidates[i] = input.nextLine();
            System.out.print("Enter votes: ");
            arrayVotesOfCandidates[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < arrayVotesOfCandidates.length; i++) {
            if (maxSoFar < arrayVotesOfCandidates[i]) {
                maxSoFar = arrayVotesOfCandidates[i];
                index1 = i;
            }
            for (int j = i + 1; j < arrayVotesOfCandidates.length; j++) {
                if (arrayVotesOfCandidates[i] == arrayVotesOfCandidates[j] && j != i) {
                    index2 = j;
                }
            }
        }
        if (arrayVotesOfCandidates[index1] == arrayVotesOfCandidates[index2]) {
            System.out.print("The election is a tie between the following candidates: " + "\n" + arrayNameOfCandidates[index1] + " (" + arrayVotesOfCandidates[index1] + " votes)" + "\n" + arrayNameOfCandidates[index2] + " (" + arrayVotesOfCandidates[index2] + " votes)");
        } else {
            System.out.println("The winner is " + arrayNameOfCandidates[index1] + " with " + maxSoFar + " votes!");
        }


    }
}
