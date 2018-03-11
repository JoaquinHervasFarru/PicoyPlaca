package picoyplaca;

public class TimeCheck {

	private int time;
	private Boolean canNotCirculate;
	private int mrningPicoStrt = 700 , mrningPicoEnd = 930, aftnPicoStrt = 1630, aftnPicoEnd = 2000;
	
	public TimeCheck(int time) {

		this.time = time;

	}
	
	public boolean check() {
	
		if (time > mrningPicoEnd && time < aftnPicoStrt) {
			
			canNotCirculate = false;
			
		} else{
			
			if (time < mrningPicoStrt && time > aftnPicoEnd) {
				
				canNotCirculate = false;
				
			} else {

				canNotCirculate = true;

				
			}
			
		}
		
		return canNotCirculate;
	}
	
}
