
package bmi;
import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the weight (in pounds): ");
        double w = input.nextDouble();
        System.out.print("Enter the height (in inches): ");
        double h = input.nextDouble();
        
        final double KG_P_P = 0.45359237;
        final double M_P_I = 0.0254;
        
        double w_in_kg = w * KG_P_P;
        double h_in_m = h * M_P_I;
        double bmi = w_in_kg / (h_in_m * h_in_m);
        
        System.out.println("BMI = " + bmi );
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi <25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }
    
}
