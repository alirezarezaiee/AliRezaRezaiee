package BMI;
import java.util.Scanner;
  public class BMI {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while(true) {
        System.out.println("enter your weight");
        float w = input.nextFloat();
        System.out.println("enter your height");
        float h = input.nextFloat();
        float BMI = w/(h*h*h);
        if(BMI < 18.5)
            System.out.println("your under weight");
        else if (BMI >= 18.5 && BMI < 25.0)
            System.out.println("your normal");
        else if (BMI >= 25.0 && BMI < 30.0)
            System.out.println("your over weigt");
        else if (BMI >= 30.0)
            System.out.println("your obese");
    }
    }
    
}
