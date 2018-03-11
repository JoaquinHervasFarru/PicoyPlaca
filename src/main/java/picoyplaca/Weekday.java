package picoyplaca;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Weekday {

	private String date;
	private int dayInt;
	
	public Weekday(String date){
		this.date =date;
	}


	public int get() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
		LocalDate formatted = LocalDate.parse(date, formatter);
		DayOfWeek day = formatted.getDayOfWeek();

		dayInt = day.getValue();
		
		return dayInt;
	}
}
