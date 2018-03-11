package picoyplaca;

public class DayCheck {

	String lastDigit;
	int day, time;
	Boolean canCirculate;
	
	public DayCheck(String lastDigit, int day, int time){

		this.lastDigit = lastDigit;
		this.day = day;
		this.time = time;

	}
	
	public boolean check() {
		
		switch (day) {
		case 1:
			canCirculate = false;	
			break;
		case 2:
			canCirculate = false;
			break;
		case 3:
			canCirculate = false;
			break;
		case 4:
			canCirculate = false;
			break;
		case 5:
			canCirculate = false;
			break;
		default:
			canCirculate = true;
			break;
		}

		return canCirculate;
	}
	
	
	
	
}
