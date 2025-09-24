//This program is going to convert celcius to fahrenheit

package celcius_to_fahrenheit;
import java.util.Scanner;
public class Celcius_to_fahrenheit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter a value for celcius: ");
                double c = input.nextDouble();
            double f = (9*c/5.0) + 32;
            System.out.println(c + " celcius = " + f + " fahrenheit");
            System.out.println("");
        }
    }
    
}
