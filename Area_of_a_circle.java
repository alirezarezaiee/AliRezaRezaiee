//This simple program asks user for a value as radius of a circle and calculates its area

package area_of_a_circle;
import java.util.Scanner;
public class Area_of_a_circle {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while (true){
                System.out.print("Enter the value of radius; ");
                double radius = input.nextInt();
                double area = Math.PI * radius * radius;
                System.out.println("Area = " + area);
                System.out.println("");
        }
    }
}
