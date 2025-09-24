//This program asks user for two numbers and it will say which of them is greater

package max_of_two_numbers;
import java.util.Scanner;
public class Max_of_two_numbers {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the first number: ");
                double x = input.nextDouble();
            System.out.print("Enter the second number; ");
                double y = input.nextDouble();
            if (x > y) {
                System.out.println(x + " is greater");
            } else {
                System.out.println(y + " is greater");
            }
            System.out.println("");
        }
    }
    
}
