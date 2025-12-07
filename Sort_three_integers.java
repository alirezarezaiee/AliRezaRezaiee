
package sort_three_integers;
import java.util.Scanner;

public class Sort_three_integers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        
        if (num1 > num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2){
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println(num1 + " < " + num2 + " < " + num3);
    }
    
}
