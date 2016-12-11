/*
 * Created by: Leena Chaleunsouk
 * On 12/03/16 @ 6:15
 */

public class Customer extends User implements CustomerAccess
{
	private String userType;
	
	public Customer() 
	{
		super();
		this.userType = "Customer";
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
