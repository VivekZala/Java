import java.util.*;

class date_and_time {

	public static void main(String ...args) {

		GregorianCalendar gc = new GregorianCalendar();

		/*
		System.out.println(gc.isLeapYear(2020));
		System.out.println(gc.get(Calendar.DATE));
		System.out.println(gc.get(Calendar.MONTH)); // Month starts form 0(Jan).
		System.out.println(gc.get(Calendar.DAY_OF_WEEK)); // This will start form 1(Monday).
		*/

		// TimeZone
		/*
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
		*/

		// Changing or setting the time zone.
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
		System.out.println(tz);
	}
}

