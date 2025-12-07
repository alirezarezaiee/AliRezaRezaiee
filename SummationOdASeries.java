
package summationodaseries;

public class SummationOdASeries {

    public static void main(String[] args) {
        
        int sum = 0;
        for (int i=1 ; i<10; i++){
            if (i<9){
                System.out.print(i +" + ");
                
            }
            else
                System.out.println(i + " = ");
                sum = sum + i;    
        }
        System.out.print( sum);
        System.out.println("");
    }
}
