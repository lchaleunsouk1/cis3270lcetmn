/*
 * Created by: Leena Chaleunsouk
 * On 12/03/16 @ 6:15
 */

public class Customer extends User
{

	public Customer() 
	{
		super();
	}
	
	public void addCustomer(Customer newCustomer)
	{
		newCustomer.setUserType("Customer");
		userArray.add(newCustomer);
	}
}
