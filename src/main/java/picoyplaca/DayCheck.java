package picoyplaca;

public class DayCheck {
	private int day;
	private String lastCharacter;

	public DayCheck(int day, String lastCharacter) {
		this.day = day;
		this.lastCharacter = lastCharacter;
	}

	public boolean check() {
		Boolean canCirculate;

		if (day == 1 && (lastCharacter == "1" || lastCharacter == "2")) {
			canCirculate = false;
		}else if (day == 2 && (lastCharacter == "3" || lastCharacter == "4")) {
			canCirculate = false;
		}else if (day == 3 && (lastCharacter == "5" || lastCharacter == "6")) {
			canCirculate = false;
		}else if (day == 4 && (lastCharacter == "7" || lastCharacter == "8")) {
			canCirculate = false;
		}else if (day == 5 && (lastCharacter == "9" || lastCharacter == "0")) {
			canCirculate = false;
		}else {
			canCirculate = true;
		}

		return canCirculate;
	}
}
