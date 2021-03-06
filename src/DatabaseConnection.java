import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DatabaseConnection  {

    protected static Connection GetConnection() throws SQLException, ClassNotFoundException
	    {
	        Connection conn = null;
	        try 
	        {
	            String driver = "oracle.jdbc.driver.OracleDriver";
	            String host = "jdbc:mysql://localhost:3306/flightreservation";
	            String username = "root";
	            String password = "";
	            Class.forName(driver);
	            conn = (Connection) DriverManager.getConnection(host, username, password);
	        } catch(SQLException e)
	        {
	            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, e);
	        }
	        return conn;
	    }
	}
	}
}