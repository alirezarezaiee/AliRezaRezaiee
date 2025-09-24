//This simple program is going to compute the average of three numbers

package compute_average;
import java.util.Scanner;
public class Compute_average {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the first number: ");
                int x = input.nextInt();
            System.out.print("Enter the second number: ");
                int y = input.nextInt();
            System.out.print("Enter the third number: ");
                int z = input.nextInt();
            double average = (x + y + z)/3.0;
            System.out.println("average = " + average);
            System.out.println("");
            
        }
        
    }
    
}
