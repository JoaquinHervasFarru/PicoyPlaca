package picoyplaca;

public class PermissionToCirculate {

	boolean licencePlateAndDay, time;
	
	public PermissionToCirculate(Boolean licencePlateAndDay,Boolean time) {
		this.licencePlateAndDay = licencePlateAndDay;
		this.time = time;
		
	}
	
	public int get() {
		
		if (licencePlateAndDay == true && time == true) {
			
			System.out.println("Lo sentimos no puede circular en la fecha y hora indicadas.");
			
			return 1;
		} else {

			System.out.println("¡¡Felicitaciones!! Usted puede circular en la fecha y hora indicadas.");

			return 0;
		}
		
	}
	
}
