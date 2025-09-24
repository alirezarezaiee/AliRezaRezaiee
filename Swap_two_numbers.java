//This program will swap the values of two variables x and y

package swap_two_numbers;
import java.util.Scanner;
public class Swap_two_numbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while(true){
        System.out.print("Enter a value for x; ");
            double x = input.nextDouble();
        System.out.print("Enter a value for y; ");
            double y = input.nextDouble();
        double z;
            z = x;
            x = y;
            y = z;
        System.out.println("x = " + (int)x);
        System.out.println("y = " + (int)y);
        System.out.println("");
        }
        
    }
    
}
