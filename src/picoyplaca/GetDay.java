package picoyplaca;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetDay {


	public void getDay(String date){

		try {

			String dateInput = date;
			Variables gotDay = new Variables();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy");
			LocalDate formatted = LocalDate.parse(dateInput, formatter);

			DayOfWeek day = formatted.getDayOfWeek();

			gotDay.setDay(day);

		} catch (Exception e) {
		
			System.out.println("error: " + e);
			
		}
	}
}
