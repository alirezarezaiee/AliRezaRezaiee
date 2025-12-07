
package random_month;

public class Random_month {

    public static void main(String[] args) {
        
        int number = (int)(Math.random()*12+1);
        
        switch(number){
            case 1 : System.out.println(number + " ---- January"); break;
            case 2 : System.out.println(number + " ---- February"); break;
            case 3 : System.out.println(number + " ---- March"); break;
            case 4 : System.out.println(number + " ---- April"); break;
            case 5 : System.out.println(number + " ---- May"); break;
            case 6 : System.out.println(number + " ---- June"); break;
            case 7 : System.out.println(number + " ---- July"); break;
            case 8 : System.out.println(number + " ---- August"); break;
            case 9 : System.out.println(number + " ---- September"); break;
            case 10 : System.out.println(number + " ---- October"); break;
            case 11 : System.out.println(number + " ---- November"); break;
            case 12 : System.out.println(number + " ---- December"); 
        }
    }
    
}
