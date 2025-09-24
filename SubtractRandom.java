//This program brings out a subtraction operation (as the 1st value is greater than the 2nd value) and user enters an answer for that
//Then the program checks wether the answer is true or false

package subtractrandom;
import java.util.Scanner;
public class SubtractRandom {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while(true){
        double num1 = (int)(Math.random() * 10);
        double num2 = (int)(Math.random() * 10);
        if (num1 < num2){
        int temp =  (int) num1;
            num1 =  num2;
            num2 =  temp;
        }
        System.out.print((int)num1 + " - " + (int)num2 + " = ");
        double mainResult = num1 - num2;
        double userResult = input.nextDouble();
        if (mainResult == userResult)
            System.out.println("true");
        else
            System.out.println("False");
            System.out.println("");
        }
    }
}
