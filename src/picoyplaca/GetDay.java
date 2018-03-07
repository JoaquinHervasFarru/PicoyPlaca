package picoyplaca;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class GetDay {
	public void getDay(){

		//	public String getDay (String date){

		DateFormat formato = new SimpleDateFormat("E");
		System.out.println(formato.format(new GetDay()));
		//return date;
	}

}
