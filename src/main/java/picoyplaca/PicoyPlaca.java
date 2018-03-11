package picoyplaca;

import java.util.Scanner;

public class PicoyPlaca {


	public static void main(String[] Args) {


		Variables licence = new Variables();
		Variables date = new Variables();
		Variables hour = new Variables();
		Variables schedule = new Variables();
		String licencePlate, dateDayMonYear ;
		int time;

		Scanner reader = new Scanner(System.in);
	//	WeekdayGetter day = new WeekdayGetter();

		System.out.println("Por favor ingrese su placa:");
		licencePlate = reader.next();
		licence.setLastCharacter(licencePlate);

		System.out.println("Por favor ingrese la fecha en formato 'aaaa-mm-dd':");
		dateDayMonYear = reader.next().trim();
		date.setDate(dateDayMonYear);
		//day.getDay(date.getDate());

		System.out.println("Por favor ingrese la hora en formato en formato de 24 horas de la forma 'hhmm':");
		time = reader.nextInt();
		hour.setTime(time);

		reader.close();

			}
}
