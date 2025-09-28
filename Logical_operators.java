
package logical_operators;
import java.util.Scanner;
public class Logical_operators {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("enter your number: ");
                int x = input.nextInt();
            if (x%2 == 0 && x%3 == 0){
                System.out.println("divisible by 2 and 3");
            } else if((x%2 == 0) || (x%3 == 0)){
                if (x%2 == 0 && x%3 != 0)
                    System.out.println("divisible by 2");
                else if (x%2 != 0 && x%3 == 0)
                    System.out.println("divisible by 3");
            } 
            else {
                System.out.println("not divisible by 2 or 3");
            }
            System.out.println("");
        }
        
    }
    
}
