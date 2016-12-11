/*
 * Created by: Leena Chaleunsouk
 * On 12/03/16 @ 6:15
 */

public class Admin extends User implements CustomerAccess, AdminAccess
{
	private String userType;

	public Admin() {
		super();
		this.userType = "Administrator";
	}

	@Override
	public void addFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePassenger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	
}
