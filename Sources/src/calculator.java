import java.util.Scanner;

public class calculator {

    public static double mortgage (double loanAmount, double interestRateMonthly, double timeInMonths ){
        return loanAmount*(interestRateMonthly*Math.pow((1+interestRateMonthly),timeInMonths))/(Math.pow((1+interestRateMonthly),timeInMonths)-1);

    }



}
