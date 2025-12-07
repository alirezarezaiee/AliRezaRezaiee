
package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("enter a number in range of 0 to 1000 : ");
        int value = input.nextInt();
        
        if (value < 10)
            System.out.print("sum of digits = " + value);
        else if (value < 100){
            int a = value / 10;
            int b = value % 10;
            System.out.println("sum of digits = " + (a + b));
        }
        else {
            int a = value / 100;
            int b = (value / 10) % 10;
            int c = value % 10;
            System.out.println("sum of digits = " + (a + b + c));
        }
    }
    
}
