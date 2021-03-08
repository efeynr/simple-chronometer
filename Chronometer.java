import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Chronometer {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    System.out.print("enter the time in minutes: ");
	    int min= input.nextInt(); 
		java.util.Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		cal.add(Calendar.MINUTE,min);
	
	
		
Calendar cal1 = Calendar.getInstance();
cal1.setTimeInMillis(System.currentTimeMillis());

do {
	cal1= Calendar.getInstance();
	
	if(cal1.getTimeInMillis()==cal.getTimeInMillis()) {
		System.out.println("Ring!");
	}
}
while(cal1.getTimeInMillis()!=cal.getTimeInMillis());
	


}
}
