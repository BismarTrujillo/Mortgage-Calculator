import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input house price:");
        double housePrice = sc.nextDouble();

        System.out.println("Input total amount of your loan:");
        double loanAmount = sc.nextDouble();

        System.out.println("Input interest rate:");
        double interestRateMonthly = (sc.nextDouble()/100)/12;

        System.out.println("Input time in years:");
        double timeInMonths = sc.nextDouble()*12;

        System.out.println("Input down-payment:");
        double downPayment = sc.nextDouble();

        double insurance = 0;

        if (downPayment < housePrice*0.2){
            insurance = loanAmount * 0.01;
        }
        double monthlyPayment = calculator.mortgage(loanAmount, interestRateMonthly, timeInMonths);
        double biweeklyPayment = monthlyPayment/2;

        System.out.println(insurance);

        System.out.println("Monthly Payment: " + (monthlyPayment + insurance));
        System.out.println("Biweekly Payment: " + (biweeklyPayment + insurance/2));





    }


}