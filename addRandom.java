
package addrandom;

import java.util.Scanner;

public class addRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double num1 = (int)(Math.random() * 10);
            double num2 = (int)(Math.random()*10);
                System.out.println( (int)(num1) + " + " + (int) num2 +" = ?");
            int mainResult = (int) (num1 + num2);
            int userResult = input.nextInt();
            if (mainResult == userResult) {
                System.out.println("True");
            }
                    
            else {
                System.out.println("False");
            }
        
    }
}
