//This program is designed to get the width and height of a rectangle as inputs and calculate its area

package perimeter_of_rectangle;
import java.util.Scanner;
public class Perimeter_of_rectangle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter the width; ");
                double w = input.nextDouble();
            System.out.print("Enter the height; ");
                double h = input.nextDouble ();
            double p = 2 * (w + h);
            System.out.println("perimeter = " + (int)p);
            System.out.println("");
        }    
    }
    
}
