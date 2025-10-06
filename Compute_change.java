// This program will 

package compute_change;
import java.util.Scanner;
public class Compute_change {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the amount (in double): ");
                double amount = input.nextDouble();
            int rAmount = (int)(amount * 100);
        
            int dollars = rAmount / 100;
            rAmount = rAmount % 100;
        
            int quarters = rAmount / 25;
            rAmount = rAmount % 25;
        
            int dimes = rAmount / 10;
            rAmount = rAmount % 10;
        
            int nickels = rAmount / 5;
            rAmount = rAmount % 5;
        
            int pennies = rAmount;
        
            System.out.println("your amount" + amount + "consists of: ");
            System.out.println("\t" + dollars + "dollars");
            System.out.println("\t" + quarters + "quarters");
            System.out.println("\t" + dimes + "dimes");
            System.out.println("\t" + nickels + "nickels");
            System.out.println("\t" + pennies + "pennies");
            System.out.println("");
        }
    }
    
}
