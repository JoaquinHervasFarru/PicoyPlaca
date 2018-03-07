package picoyplaca;

public class Character {

	private String licence;

	public Character(String licence) {
		
//		String lastCharacter;
		
		this.licence = licence.substring(licence.length() - 1);
		return;
	}
}
