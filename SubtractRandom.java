
package subtractrandom;

import java.util.Scanner;



public class subtractRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num1 = (int)(Math.random() * 10);
        double num2 = (int)(Math.random() * 10);
        if (num1 < num2){
        int temp =  (int) num1;
            num1 =  num2;
            num2 =  temp;
        }
        System.out.println((int)num1 + " - " + (int)num2 + " = ?");
        double mainResult = num1 - num2;
        double userResult = input.nextDouble();
        if (mainResult == userResult)
            System.out.println("true");
        else
            System.out.println("False");
    }
}
