package picoyplaca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date {

	DateFormat formato = new SimpleDateFormat("E");
	System.out.println(formato.format(new Date()));
}
