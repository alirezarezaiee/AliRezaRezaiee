//This program gets a number input as year 
//Then it will check wether the year is a leap year or not

package check_leap_year;
import java.util.Scanner;
public class Check_leap_year {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.print("Enter a value for year; ");
            short year = input.nextShort();
            if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
                System.out.println(year + " is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
            System.out.println("");
        }
    }
}
