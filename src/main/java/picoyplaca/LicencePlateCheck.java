package picoyplaca;

public class LicencePlateCheck {

	int day;
	Boolean canCirculate;

	public LicencePlateCheck(int day){

		this.day = day;

	}

	public boolean check() {

		switch (day) {
		case 1 :
			canCirculate = true;	
			break;
		case 2:
			canCirculate = true;
			break;
		case 3:
			canCirculate = true;
			break;
		case 4:
			canCirculate = true;
			break;
		case 5:
			canCirculate = true;
			break;
		default:
			canCirculate = false;
			break;
		}

		return canCirculate;
	}		
}