
package solve_quadratic_equation;

import java.util.Scanner;

public class Solve_quadratic_equation {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values for a, b and c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        double discriminant = b*b-4*a*c;
        double x1 = (-b+Math.pow(discriminant, 0.5))/(2*a);
        double x2 = (-b-Math.pow(discriminant, 0.5))/(2*a);
        
        if (discriminant>0)
            System.out.println("The equation has two real solutions " + x1 + " and " + x2);
        else if (discriminant == 0)
            System.out.println("The equation has one real solution " + x1);
        else 
            System.out.println("The equation has no real solutions");
    }
    
}
