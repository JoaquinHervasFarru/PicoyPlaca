package picoyplaca;

import java.util.Scanner;
//import 
public class main {

	private static Variables licence;

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la placa: ");
		licence.setLicenceplate(scanner.nextLine());
		;
		
		scanner.close();
	}

}
