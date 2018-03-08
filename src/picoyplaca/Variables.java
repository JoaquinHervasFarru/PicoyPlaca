package picoyplaca;

public class Variables {
	
	String  date, lastCharacter;
	int time;
	final int mrningPicoStrt = 700 , mrningPicoEnd = 930, aftnPicoStrt = 1630, aftnPicoEnd = 2000;	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getLastCharacter() {
		return lastCharacter;
	}

	public void setLastCharacter(String lastCharacter) {
		this.lastCharacter = lastCharacter.substring(lastCharacter.length() - 1);;
	}
}
