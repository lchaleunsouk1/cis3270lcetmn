import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection  {

	public static void main (String [] args) throws Exception{
	//	getConnection();
		try {
			Class.forName("com.mysql.jbdc.Driver").newInstance();}
		catch (Exception ex)
		{
		}
		}
	//}

	public static Connection getConnection(Connection conn) throws Exception {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightreservation")
			//String driver = "oracle.jdbc.driver.OracleDriver";
			//String url = "jdbc:mysql://localhost:3306/flightreservation";
			//String username = "root";
			//String password = "24665123";
			//Class.forName(driver);

			//Connection conn = DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successfull!");
		} 
		catch (SQLException ex) 
		{
			//System.out.println("Connection Not Successfull");
			System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
		return null;
	}
}