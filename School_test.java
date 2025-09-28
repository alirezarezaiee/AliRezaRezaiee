//This program asks for a student's scores and it will determine the level of his intelligence

package school_test;
import java.util.Scanner;
public class School_test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Score for math: ");
                byte a = input.nextByte();
            System.out.print("Score for chemistry: ");
                byte b = input.nextByte();
            System.out.print("Score for physics: ");
                byte c = input.nextByte();
            System.out.print("Score for biology: ");
                byte d = input.nextByte();
            System.out.print("Score for dari: ");
                byte e = input.nextByte();
            System.out.print("Score for pashto: ");
                byte f = input.nextByte();
            System.out.print("Score for english: ");
                byte g = input.nextByte();
            System.out.print("Score for taphseer: ");
                byte h = input.nextByte();
            System.out.print("Score for dini: ");
                byte i = input.nextByte();
            System.out.print("Score for geography: ");
                byte j = input.nextByte();
            System.out.print("Score for history: ");
                byte k = input.nextByte();
            double average = (a+b+c+d+e+f+g+h+i+j+k)/11;
            if (average >= 60){
                if (average >= 70){
                    if (average >= 80){
                        if (average >= 90){
                            System.out.println("group: A");
                        } else 
                            System.out.println("group: B");
                    }else
                        System.out.println("group: C");
                }else 
                    System.out.println("group: D");
             }else 
                System.out.println("Try more");
                System.out.println("");
            
            
        }
    }
}
