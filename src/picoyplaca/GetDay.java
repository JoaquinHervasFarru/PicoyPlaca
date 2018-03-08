package picoyplaca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDay {
	
	private String date;
	
	public String getDay(String date){

		
		Date toFormat = new Date();
		DateFormat formated = new SimpleDateFormat("EEE");
		Calendar.DAY_OF_WEEK
		Date.parse(date);
		
		
		Date dayDate = formated.format(toFormat);
	
	}

}
