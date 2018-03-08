package picoyplaca;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GetDay {
	
	
	public DayOfWeek getDay(String date){

		String dateInput = date;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
	    LocalDate formatted = LocalDate.parse(dateInput, formatter);
	
	    DayOfWeek day = formatted.getDayOfWeek();
	    	        
	return day ;
	
	
	}

}
