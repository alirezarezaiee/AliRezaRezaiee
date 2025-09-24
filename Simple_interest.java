//This program takes three inputs (time, rate and finance) and calculates the corresponding simple interst

package simple_interest;
import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the total finance: ");
                double f = input.nextDouble();
            System.out.print("Enter the time (in years): ");
                double t = input.nextDouble();
            System.out.print("Enter the rate: ");
                double r = input.nextDouble();
            double interest = (t * r * f)/100.0;
            System.out.println("Simple interest = " + interest);
            System.out.println("");
        }
    }
    
}
