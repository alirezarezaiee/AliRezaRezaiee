//This simple program asks user a number and it checks wether the number is even or odd

package even_or_odd_test;
import java.util.Scanner;
public class Even_or_odd_test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter a number: ");
            int x = input.nextInt();
            if (x%2 == 0){
                if (x == 0){
                    System.out.println(x + " is neither even nor odd");
                } else 
                System.out.println(x + " is even");
            }
            else {
                System.out.println(x + " is odd");
            }
            System.out.println("");
        }
    }
    
}
