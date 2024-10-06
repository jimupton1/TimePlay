
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class TimePlay {

  public static void main(String[] args) {
   
         // April 22, 10:15 PM EST
         TimePlay tp = new TimePlay();
         int year = 2021;
         int month = Calendar.APRIL;
         int dayOfMonth = 22;
         int hour = 22;
         int minute = 15;
         TimeZone tz = TimeZone.getTimeZone("EST"); // different flavors can be used here.
         
         tp.listTimeZones();
           
         tp.printDateTime(year, month, dayOfMonth, hour, minute, tz);
         
         System.out.println(TimeZone.getDefault());
    
  }
  
  private void printDateTime(int year, int month, int dayOfMonth,
                             int hour, int minute,
                             TimeZone tz
                            ) {
    
    Calendar cal = Calendar.getInstance();

    cal.set(Calendar.YEAR, year);
    cal.set(Calendar.MONTH, month);
    cal.set(Calendar.DAY_OF_MONTH, dayOfMonth);
    cal.set(Calendar.HOUR, hour);
    cal.set(Calendar.MINUTE, minute);
    cal.setTimeZone(tz);
    
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm a");

    formatter.setTimeZone(TimeZone.getTimeZone("UTC"));  
    System.out.println("UTC " + formatter.format(cal.getTime().getTime()));
    
    formatter.setTimeZone(TimeZone.getTimeZone("GMT-5"));  
    System.out.println("EST " + formatter.format(cal.getTime().getTime()));
    
    formatter.setTimeZone(TimeZone.getTimeZone("GMT-8"));  
    System.out.println("PST " + formatter.format(cal.getTime().getTime()));
    
  }
  
  
 private void listTimeZones() {
   
  
   String[] timezones = TimeZone.getAvailableIDs();
   
   for(int i=0; i < timezones.length;i++) {
     //System.out.println(timezones[i]);
   }
   
 }
  
}
