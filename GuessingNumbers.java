package guessing.numbers;
import java.util.Scanner;
public class GuessingNumbers {
    public static void main(String[] args) {
    int number = (int)(Math.random()*101);
    Scanner input = new Scanner(System.in);
        System.out.println("Guess an number between 0 and 100");
        int guess = -1; 
        while(number != guess) {
            guess = input.nextInt();
         if (number == guess )
                System.out.println("correct");
         else if (guess < number)
                System.out.println("try higher number");
         else if (guess > number)
                System.out.println("try lower number");
         else
                System.out.println("out of band");
        
        }
    }

}






/*while(clientnum != servernum) {
     int servernum =(int)(Math.random() *101);
     Scanner input = new Scanner(System.in);
        System.out.println("Guess an nummber between 0 and 100");
        int clientnum = input.nextInt();
        if (clientnum == servernum)
            System.out.println("correct");
        break;
            else {
            if(clientnum < servernum)
                System.out.println("try a bigger number");
            else if (clientnum > servernum)
                System.out.println("try a smaller");
            }
    }
*/