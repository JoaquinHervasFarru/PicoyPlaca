package picoyplaca;

public class FinalResult {

	private String lastDigit;
	private int time, day;

	public FinalResult(String lastDigit, int day, int time) {

		this.day = day;
		this.lastDigit = lastDigit;
		this.time = time;

	}

	public boolean canCirculate() {

		boolean hasRestriction = new DayCheck(day, lastDigit).check();
		if (!hasRestriction) return true;

		boolean allowedHour = new TimeCheck(time).check(); 
		if (allowedHour) {
			return true;
		} else {
			return false;
		}
	}
}