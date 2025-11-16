package divisablenumberby2and3;

import java.util.Scanner;

public class Divisablenumberby2and3 {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   while(true ) {
        System.out.println("enter your number");
        int a = input.nextInt();
        if (a % 2 == 0 && a %3 == 0)
            System.out.println("devisable by 2 and 3");
       
        else  if (a % 2 != 0 && a % 3 ==0)
            System.out.println("devisable by 3 not 2");
         else if(a % 2 == 0 && a % 3 !=0)
            System.out.println("devisable by 2 not 3");
         else  if (a % 2 != 0 && a % 3 !=0)
            System.out.println("not devisable by 3 and 2");
    }
    }
}

