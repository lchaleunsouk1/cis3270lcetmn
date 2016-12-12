
public class Driver 
{
	public static void main(String[] args) throws Exception{
		
		try {
			Class.forName("com.mysql.jbdc.Driver").newInstance();}
		catch (Exception ex)
		{
		}
		DatabaseConnection.getConnection();
		new SplashScreen();
	}
}
