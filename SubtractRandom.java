
package subtractrandom;

import java.util.Scanner;

public class SubtractRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double num1 = (int)(Math.random()*10);
        double num2 = (int)(Math.random()*10);
        must (num1 > num2) ;
    }
    
}
