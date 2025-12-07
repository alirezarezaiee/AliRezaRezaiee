
package windchilltemperature;

import java.util.Scanner;

public class WindChillTemperature {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double t = input.nextDouble();
        System.out.print("Enter the wind speed (7 = 2) in miles per hour: ");
        double v = input.nextDouble();
        
        double result = 35.74 + 0.6215*t - 35.75 * Math.pow(v, 0.16) + 0.4275*t* Math.pow(v, 0.16);
        
        System.out.println("The wind chill index is : " + result);
    }
    
}
