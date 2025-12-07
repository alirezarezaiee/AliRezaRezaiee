
package add_three_numbers;

import java.util.Scanner;

public class Add_three_numbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int a = (int)((Math.random()*100)/10);
        int b = (int)((Math.random()*100)/10);
        int c = (int)((Math.random()*100)/10);
        System.out.print(a + " + " + b + " + " + c + " = ");
        int result = input.nextInt();
        
        if (a+b+c == result)
            System.out.println("It is true");
        else 
            System.out.println("It is not true");
    }
    
}
