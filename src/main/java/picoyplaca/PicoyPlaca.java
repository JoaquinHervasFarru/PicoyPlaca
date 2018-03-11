package picoyplaca;

import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PicoyPlaca {
	public static void main(String[] Args) {
		String lastDigit = null, licencePlate = null, dateDayMonYear = null;
		int time = -1, weekDay = -1;

		Scanner reader = new Scanner(System.in);

		while (lastDigit == null) {
			System.out.println("Por favor ingrese su placa:");
			licencePlate = reader.next();

			try {
				lastDigit = new LastCharacter(licencePlate).get();	
			} catch (IllegalStateException exc) {
				System.out.println("La placa ingresada no es correcta");			
			}
		}

		while (weekDay == -1) {
			System.out.println("Por favor ingrese la fecha en formato 'aaaa-mm-dd':");
			dateDayMonYear = reader.next().trim();

			try {
				weekDay = new Weekday(dateDayMonYear).get();	
			} catch (DateTimeParseException exc) {
				System.out.println("La fecha ingresada no es correcta");			
			}
		}

		while (time == -1) {
			System.out.println("Por favor ingrese la hora en formato en formato de 24 horas de la forma 'hhmm':");

			try {
				time = reader.nextInt();
			} catch (InputMismatchException exc) {
				System.out.println("La hora ingresada no es correcta");			
			}
		}

		reader.close();

		if (new FinalResult(lastDigit, weekDay, time).canCirculate()) {
			System.out.println("¡¡Felicitaciones!! Usted puede circular libremente");
		} else {
			System.out.println("Lamentablemente usted no puede circular en la fecha ingresada");
		}
	}
}