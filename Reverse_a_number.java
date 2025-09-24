//This program will reverse the input number (with 3 digits) digit by digit as 123 to 321

package reverse_a_number;
import java.util.Scanner;
public class Reverse_a_number {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter a three digit number: ");
               int x = input.nextInt ();
            int a = (x%10) * 100;
            int b = ((x/10)%10) * 10;
            int c = x/100;
            int reverse = a + b + c;
            System.out.println(reverse);
            System.out.println("");
        }
    }
    
}
