package loanpayment;
import java.util.Scanner;
public class Loanpayment {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the interest rate");
    float intersetrate = input.nextFloat();
    System.out.println("enter the number of year");
    float year = input.nextFloat();
    System.out.println("enter the loan amount");
    float loan = input.nextFloat();
    double mounthlypayment = (loan*intersetrate)/(1 - ( 1 )/Math.pow((1 + intersetrate),(year)*(12)));
    System.out.println("the mounthly payment = " + mounthlypayment + "$");
    
   }
}
