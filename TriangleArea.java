
package trianglearea;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the coordinates of three points separated by spaces\n" +
                         "like x1 y1 x2 y2 x3 y3: " );
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        double a = Math.pow((x2 - x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
        double b = Math.pow((x3 - x1)*(x3-x1)+(y3-y1)*(y3-y1), 0.5);
        double c = Math.pow((x2 - x3)*(x2-x3)+(y2-y3)*(y2-y3), 0.5);
        
        double p = (a + b +c)/2.0;
        double area = Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
        System.out.println("The area of the triangle is : " + area);
    }
    
}
