//converts given fahrenheit to celcius

package fahrenheit_to_celcius;
import java.util.Scanner;
public class Fahrenheit_to_celcius {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter a value for fahrenheit: ");
                double f = input.nextDouble();
            double c = (5.0/9) * (f - 32);
            System.out.println(f + " degrees fahrenheit = " + c + " celcius");
            System.out.println("");
        }
    }
    
}
