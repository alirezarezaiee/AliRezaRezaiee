
package runawaylength;

import java.util.Scanner;

public class RunAwayLength {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an aeroplane's take off velocity v and acceleration a : ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        
        float result = (float)((v*v)/(2*a));
        System.out.println("runaway length = " + result);
    }
    
}
