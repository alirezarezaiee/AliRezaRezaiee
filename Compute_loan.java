// this applet will calculate monthly and total payment of a specific amount of loan

package compute_loan;
import java.util.Scanner;
public class Compute_loan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter annual interest rate: ");
                double annualInterestRate = input.nextDouble();
            System.out.print("Enter number of years as an integer: ");
                int year = input.nextInt();
            System.out.print("Enter loan amount: ");
                double loan = input.nextDouble();
            
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPay = loan * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, year * 12));
            double totalPay = monthlyPay * year * 12;
            
            System.out.println("Monthly payment = " + (int)(monthlyPay * 100) / 100.0);
            System.out.println("Total payment = " + (int)(totalPay * 100) / 100.0);
            System.out.println("");
        }
    }
    
}
