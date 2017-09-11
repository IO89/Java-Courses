import java.util.Scanner;

public class ObjectsApplicantProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Applicant applicantArray [] = new Applicant[4];
        for(int i=0;i<applicantArray.length;i++){
            System.out.print("Enter "+(i+1)+". name: " );
            String name = input.nextLine();
            System.out.print("Enter points: ");
            String points = input.nextLine();
            applicantArray[i]= new Applicant(name,Integer.parseInt(points));
        }
        System.out.print("\nEnter the minimum of required points: ");
        String minimumPoints = input.nextLine();

        System.out.print("\nThe following applicants achieved the minimum of "+ minimumPoints+" points: ");
        for (int i=0;i<applicantArray.length;i++){
            if(applicantArray[i].getPoints()>=Integer.parseInt(minimumPoints)){
                System.out.println(applicantArray[i].getName()+", "+applicantArray[i].getPoints()+" points");
            }
        }
    }
}
