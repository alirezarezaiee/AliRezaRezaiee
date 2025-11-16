package dec2hex;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("enter an dicimal number : ");
        int dicimal = input.nextInt();
        String hex ="";
        while (dicimal != 0) {
            int hexValue = dicimal % 16;
            char hexDigit = (0 <=hexValue && hexValue <= 9)?
                    (char)(hexValue + '0'): (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            dicimal = dicimal / 16;
        }
        System.out.println("the hex number is " + hex);
    }
    
}
