
package sylindervolume;

import java.util.Scanner;

public class SylinderVolume {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter radius and length of a sylinder :");
        double length = input.nextDouble();
        double radius = input.nextDouble();
        
        double area = Math.PI * radius * radius;
        double volume = area * length;
        
        System.out.println("area = " + area);
        System.out.println("volume = " + volume);
    }
    
}
