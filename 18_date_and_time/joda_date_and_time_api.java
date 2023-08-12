import java.time.*;

class joda_date_and_time_api {

	public static void main(String ...args) {

		// LocalDate
		// LocalDate d = LocalDate.now();
		// LocalDate d = LocalDate.of(2000, Month.NOVEMBER, 28);
		// LocalDate d = LocalDate.ofEpochDay(0); // Since the day of start.
		// System.out.println(d);

		// LocalTime
		// LocalTime l = LocalTime.now();
		// System.out.println(l);

		// LocalDateTime
		LocalDateTime l = LocalDateTime.now();
		System.out.println(l);
	
	}
}
