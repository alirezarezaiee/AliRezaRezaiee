//This project asks the user for a value for total seconds and it will change that in the form of hours, minutes and seconds

package display_time;
import java.util.Scanner;
public class Display_time {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter your total seconds: ");
                int ts = input.nextInt();
            int hour = ts/3600;
            int minute = (ts%3600) / 60;
            int second = ((ts%3600) % 60);
            System.out.println(ts+ " seconds =>  " +hour+ " : " +minute+ " : " +second);
            System.out.println("");
        }
    }
    
}
