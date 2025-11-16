package taxofshopping;

import java.util.Scanner;

public class Taxofshopping {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the price");
        double price = input.nextDouble();
        System.out.println("How match is the tax");
        double tax = input.nextDouble();
        double total = price*tax/100 + price;
        
        System.out.printf("Your total coast is " +"%.2f",total);
    }
    
}


        
    
 
