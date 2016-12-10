import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection  {

	public static void main (String [] args) throws Exception{
		getConnection();
	}

	public static Connection getConnection() throws Exception {

		try {

			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:mysql://localhost:3306/flightreservation";
			String username = "root";
			String password = "24665123";
			Class.forName(driver);

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successfull!");

		} catch (Exception e) {
			System.out.println("Connection Not Successfull");
		}
		return null;
	}
}