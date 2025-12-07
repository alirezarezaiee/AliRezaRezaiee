
package solveequation;

public class SolveEquation {

    public static void main(String[] args) {
        
        System.out.println("  3.4x + 50.2y = 44.5  \n  2.1x + 0.55y = 5.9 \n");
        
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        
        double x = (e*d-b*f)/(a*d-b*c);
        double y = (a*f-e*c)/(a*d-b*c);
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
    
}
