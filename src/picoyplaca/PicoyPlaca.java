package picoyplaca;

import java.util.Scanner;

public class PicoyPlaca {
	
	public static void main(String[] Args) {
		
		Variables licence = new Variables();
		Variables date = new Variables();
	//	Variables time = new Variables();
		Scanner reader = new Scanner(System.in);
		String licencePlate, dateDayMonYear ;
		
		System.out.println("Por favor ingrese su placa:");
		licencePlate = reader.next();
		licence.setLastCharacter(licencePlate);
		
		System.out.println("Por favor ingrese la fecha en formato dd/mm/aaaa:");
		dateDayMonYear = reader.next();
		date.setDate(dateDayMonYear);
		
		
		System.out.println(licence.getLastCharacter());
		System.out.println(date.getDate());
		reader.close();
	}
	
}