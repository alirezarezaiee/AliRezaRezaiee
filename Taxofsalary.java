package taxofsalary;

import java.util.Scanner;

public class Taxofsalary {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
        System.out.println("enter your salary");
        double salary = input.nextDouble();
        double tax = 0;
        if (salary <=5000)
            System.out.println("tax = 0");
        else if(salary >=5001) {
            System.out.println("tax = " + (salary -5000)*0.02);
        }
        else if (salary >= 12501) {
            System.out.println("tax = " + ((salary -12500)*0.1 + 150));
        }
        else if (salary >=100001) {
            System.out.println("tax = " + ((salary - 100000)*0.2+8875));
        }
        
        }
    
    }
}

/*
tax between 0-5000afg = 0%
tax between 5001-12500afg = 2%
tax between 12501-100000afg = 10%    and 150afg constant
tax of salary >100001afg = 20%       and 8875afg constant
*/