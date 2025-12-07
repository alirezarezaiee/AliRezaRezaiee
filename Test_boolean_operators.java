//This program will check divisibility of a number by 2 and 3 using ligical operators

package test_boolean_operators;
import java.util.Scanner;
public class Test_boolean_operators {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("enter your number: ");
                int x = input.nextInt();
            if (x%2 == 0 && x%3 == 0){
                System.out.println("divisible by 2 and 3");
            }
            if((x%2 == 0) || (x%3 == 0)){
//              if (x%2 == 0 && x%3 != 0)
//                  System.out.println("divisible by 2");
//              else if (x%2 != 0 && x%3 == 0)
//                  System.out.println("divisible by 3");
                System.out.println("divisible by 2 or 3");
            }
            if (x%2 == 0 ^ x%3 == 0){
                System.out.println("divisible by 2 or 3, but not both");
            }
//            else {
//                System.out.println("not divisible by 2 or 3");
//            }
            System.out.println("");
        }
    }
}
