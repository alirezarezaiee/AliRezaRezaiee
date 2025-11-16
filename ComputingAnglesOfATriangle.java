package computing.angles.of.a.triangle;

import java.util.Scanner;

public class ComputingAnglesOfATriangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("enter the x1");
        float x1 = input.nextFloat();
        System.out.println("enter the x2");
        float x2 = input.nextFloat();
        System.out.println("enter the x3");
        float x3 = input.nextFloat();
        System.out.println("enter the y1");
        float y1 = input.nextFloat();
        System.out.println("enter the y2");
        float y2 = input.nextFloat();
        System.out.println("enter the y3");
        float y3 = input.nextFloat();
    float a = (float)Math.sqrt(Math.pow((y3-y2),2) + Math.pow(x3-x2, 2));
    float b = (float)Math.sqrt(Math.pow((y3-y1),2) + Math.pow(x3-x1, 2));
    float c = (float)Math.sqrt(Math.pow((y2-y1),2) + Math.pow(x2-x1, 2));
    float A = (float)Math.acos((a * a - b * b - c * c) / (-2 * b * c));
    float B = (float)Math.acos((b * b - a * a - c * c) / (-2 * a * c));
    float C = (float)Math.acos((c * c - b * b - a * a) / (-2 * a * b));
    A = (float) Math.toDegrees(A);
    B = (float) Math.toDegrees(B);
    C = (float) Math.toDegrees(C);
        System.out.println("The Angle of A = " + A);
        System.out.println("The Angle of B = " + B);
        System.out.println("The Angle of C = " + C);
    }
  }

