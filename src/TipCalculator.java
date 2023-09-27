import java.util.Scanner;
import java.text.DecimalFormat;
public class TipCalculator {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double totalTipAmount;
        double totalBill;
        double tipPerPerson;
        double totalPerPerson;

        System.out.println("What is the total bill?: ");
        double total = scan.nextDouble();

        System.out.println("What percentage of tip do you want to give?: ");
        double tipPercent = scan.nextDouble();

        System.out.println("What is the total number of people?: ");
        int totalPeople = scan.nextInt();

        totalTipAmount = total * (tipPercent / 100);
        totalBill = totalTipAmount + total;
        tipPerPerson = totalTipAmount / totalPeople;
        totalPerPerson = (totalBill / totalPeople);

        System.out.println("The total tip amount is: " + df.format(totalTipAmount));
        System.out.println("The Total Bill including tip is: " + df.format(totalBill));
        System.out.println("The tip per person is: " + df.format(tipPerPerson));
        System.out.println("The total per person is: " + df.format(totalPerPerson));

    }
}