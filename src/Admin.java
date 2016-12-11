/*
 * Created by: Leena Chaleunsouk
 * On 12/03/16 @ 6:15
 */

public class Admin extends User
{

	public Admin() 
	{
		super();
	}
	
	public static void addAdmin(Admin newAdmin)
	{
		newAdmin.setUserType("Admin");
		userArray.add(newAdmin);
	}
	
}
