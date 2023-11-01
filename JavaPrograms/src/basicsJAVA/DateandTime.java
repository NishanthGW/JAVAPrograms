package basicsJAVA;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateandTime {

	public static void main(String[] args) {
		// Getting current date and time
		
		//current date
        System.out.println("Current date : "+java.time.LocalDate.now()); 
        
        //current time
        System.out.println("Current Time : "+(java.time.LocalTime.now()));
        
        //current date and time
		System.out.print("Current date and time : ");

		//Date and Time with desired format:
		String timeDate = "dd_MM_yyyy HH:mm:ss";
		String	DateD = "dd-MM-yyy";		
		SimpleDateFormat format = new SimpleDateFormat(timeDate);
		Date date = new Date();
		System.out.println(format.format(date));
		System.out.println("======================================");
		
		//Date after 6 months
        SimpleDateFormat stf = new SimpleDateFormat(DateD);
        Date d = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -6);
        System.out.println("Current Date : "+stf.format(d));
        System.out.println("Before 6 months : "+stf.format(cal.getTime()));
		System.out.println("======================================");

		//Default TimeZone
		SimpleDateFormat sdf = new SimpleDateFormat(timeDate);
		Date dt = new Date();
		Calendar cale = new GregorianCalendar();
		cale.setTime(dt);
        System.out.println("Current time : "+sdf.format(cale.getTime()));
        System.out.println(cale.getTime());
        System.out.println("Time Zone : "+cale.getTimeZone().getID());
        System.out.println("Time Zone Name : "+cale.getTimeZone().getDisplayName());
		System.out.println("======================================");

		//UTC TimeZone
        TimeZone UTC = TimeZone.getTimeZone("UTC");
//        SimpleDateFormat sdf2 = new SimpleDateFormat();
		Calendar calen = new GregorianCalendar();
//        sdf2.setTimeZone(UTC);
        calen.setTimeZone(UTC);        
        System.out.println("Time Zone : "+calen.getTimeZone().getID());
        System.out.println("Time Zone Name : "+calen.getTimeZone().getDisplayName());
        System.out.println("UTC Date and Time : "+calen.getTime());
	}

}
