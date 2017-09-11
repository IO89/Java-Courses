import java.text.DecimalFormat;
public class ObjectsPizzaProgram {

    public static void main(String[] args){
    Pizza first = new Pizza("Diavolo",8.75);
    Pizza second = new Pizza("Frutti al Mare",9.00);
    Pizza third = new Pizza("Alla Pollo",7.50);


    System.out.println(first.toString());
    System.out.println(second.toString());
    System.out.println(third.toString());

    }
}
