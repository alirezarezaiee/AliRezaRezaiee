//This program calculates the tax of a purchasement by 6% up to two decimal places

package purchase_tax;
import java.util.Scanner;
public class Purchase_tax {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the purchase amount in dollars: ");
                double purchase = input.nextDouble();
            double tax = purchase * 0.06;
            System.out.println("tax = " +(int)(tax * 100)/100.0);
            System.out.println("");
        }
        
    }
    
}
