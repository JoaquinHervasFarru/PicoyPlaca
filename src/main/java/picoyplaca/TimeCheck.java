package picoyplaca;

public class TimeCheck {
	private int time;
	private int mrningPicoStrt = 700 , mrningPicoEnd = 930, aftnPicoStrt = 1630, aftnPicoEnd = 2000;

	public TimeCheck(int time) {
		this.time = time;
	}

	public boolean check() {
		Boolean canCirculate;

		if (time > mrningPicoEnd && time < aftnPicoStrt) {
			canCirculate = true;
		} else if (time < mrningPicoStrt && time > aftnPicoEnd) {
			canCirculate = true;
		} else {
			canCirculate = false;
		}

		return canCirculate;
	}
}
