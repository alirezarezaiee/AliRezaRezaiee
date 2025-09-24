
package show_current_time;
public class Show_current_time {
    public static void main(String[] args) {
        
       long tms = System.currentTimeMillis();
       long ts = tms / 1000;
       long currentSec = ts%60 ;
       long tm = ts / 60;
       long currentMin = tm % 60;
       long th = tm / 60;
       long currentHour = th % 24;
        System.out.println("Current time is  " +currentHour+ ":" +currentMin+ ":" +currentSec+ " GMT");
        System.out.println("");
    }
    
}
