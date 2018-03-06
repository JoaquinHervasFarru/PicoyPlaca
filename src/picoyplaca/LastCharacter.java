package picoyplaca;

import picoyplaca.Variables;

public class LastCharacter (){
	public static void main (String[] args){
		String lastCharacter;
		String string = "licence";
		lastCharacter = string.substring(string.length() - 1);
		System.out.println(lastCharacter);

	}
}
