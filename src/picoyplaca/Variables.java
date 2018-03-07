package picoyplaca;

public class Variables {
	
	String licencePlate, date, lastCharacter;
	int time, mrningPicoStrt = 700 , mrningPicoEnd = 930, aftnPicoStrt = 1630, aftnPicoEnd = 2000;	
	
	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicenceplate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

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
		this.lastCharacter = lastCharacter;
	}
}
