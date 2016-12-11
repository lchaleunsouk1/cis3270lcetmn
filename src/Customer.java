/*
 * Created by: Leena Chaleunsouk
 * On 12/03/16 @ 6:15
 */

public class Customer extends User implements CustomerAccess
{
	
	public Customer() 
	{
		super();
		super.userType = "Customer";
	}

	@Override
	public void bookFlight(Flight flight) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeFlight(Flight flight) {
		// TODO Auto-generated method stub
		
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "User\nUsername:\t" + userName + "\nEmail:\t\t" + email + "\nPassword:\t" + password 
				+ "\nUser Type:\t" + userType + "\nFirst Name:\t" + fName + "\nLast Name:\t" + lName 
				+ "\nSSN:\t\t" + ssn + "\nAddress:\t" + address + "\nZip:\t\t" + zip
				+ "\nState:\t\t" + state + "\nSecurityQuestion: " + secQuestion 
				+ "\nSecurity Answer: " + secAnswer + "\n";
	}

}
