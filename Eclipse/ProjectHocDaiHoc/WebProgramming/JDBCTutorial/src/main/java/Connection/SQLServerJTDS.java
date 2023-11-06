package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerJTDS {
	public static Connection getSQLServerConnection_JTDS() throws SQLException,ClassNotFoundException {
		String hostName = "localhost";
		String instanceName = "DESKTOP-J98APIA/SQLEXPRESS";
		String database = "Product";
		String userName = "sa";
		String password = "Thinhyeuhocbai123";
		
		return getSQLServerConnection_JTDS(hostName, instanceName, database, userName, password);
	}
	
	public static Connection getSQLServerConnection_JTDS(String hostName, String instanceName, String database, String userName, String password) throws SQLException, ClassNotFoundException{
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		
		String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" + database + ";instance=" +instanceName;
		
		Connection connection = DriverManager.getConnection(connectionURL, userName, password);
		return connection;
	}
}
