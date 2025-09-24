//This program will calculate the sum of first N natural numbers

package sum_of_n_natural_numbers;
import java.util.Scanner;
public class Sum_of_n_natural_numbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the value for N: ");
                int N = input.nextInt();
            int sum = N * (N + 1)/2;
            System.out.println("Answer = " + sum);
            System.out.println("");
        }
        
    }
    
}
