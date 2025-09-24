//This program shows a sum operation for user and the user must type the answer
//Then this program will check wether the answer is true or false

package addrandom;
import java.util.Scanner;
public class AddRandom {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while(true){
            double num1 = (int)(Math.random() * 10);
            double num2 = (int)(Math.random()*10);
                System.out.print( (int)(num1) + " + " + (int) num2 +" = ");
            int mainResult = (int) (num1 + num2);
            int userResult = input.nextInt();
            if (mainResult == userResult) {
                System.out.println("True");
            }
                    
            else 
                System.out.println("False");
                System.out.println("");
            
        }
    }
}
