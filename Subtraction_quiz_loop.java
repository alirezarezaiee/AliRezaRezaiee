
package subtraction_quiz_loop;
import java.util.Scanner;
public class Subtraction_quiz_loop {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("how many times do you subtract? ");
        int NUMBER_OF_QUESTIONS = input.nextInt();
        
        int count = 0;
        int countCorrect = 0;
        String output = "";
        long startTime = System.currentTimeMillis();
        
        while (count < NUMBER_OF_QUESTIONS){
            int num1 = (int)(Math.random()*10);
            int num2 = (int)(Math.random()*10);
        
            if (num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
        
            System.out.print(num1 + " - " + num2 + " = ");
            int answer = input.nextInt();
            
            if (num1 - num2 == answer) {
                System.out.println("You are correct \n");
                countCorrect++;
            }
            else{
                System.out.println("Your answer is wrong \n ");
            }
            
            output += num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? "    correct" : "    wrong") + "\n"; 
            count++;
        }
        
        long endTime = System.currentTimeMillis();
        int testTime = (int)(endTime - startTime) / 1000;
        
        System.out.println("operation time is " + testTime + " seconds");
        System.out.println("Correct count is " + countCorrect + "\n");
        System.out.println(output);
    }
    
}
