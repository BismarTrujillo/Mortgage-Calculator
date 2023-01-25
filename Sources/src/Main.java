import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input total amount of your loan:");
        double loanAmount = sc.nextDouble();

        System.out.println("Input interest rate:");
        double interestRateMonthly = (sc.nextDouble()/100)/12;


        System.out.println("Input time in years:");
        double timeInMonths = sc.nextDouble()*12;

        double monthlyPayment = loanAmount*(interestRateMonthly*Math.pow((1+interestRateMonthly),timeInMonths))/(Math.pow((1+interestRateMonthly),timeInMonths)-1);
        double biweeklyPayment = monthlyPayment/2;
        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Biweekly Payment: " + biweeklyPayment);





    }


}