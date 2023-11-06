package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerJDBC {
	public static Connection getSQLServerConnection_JDBC() throws SQLException, ClassNotFoundException{
		String hostName = "localhost";
		String instanceName = "DESKTOP-J98APIA/SQLEXPRESS";
		String database = "Product";
		String userName = "sa";
		String password = "Thinhyeuhocbai123";
		
		return getSQLServerConnection_JDBC(hostName, instanceName, database, userName, password);
	}
	
	public static Connection getSQLServerConnection_JDBC(String hostName, String instanceName, String database, String userName, String password) throws SQLException, ClassNotFoundException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		
		String connectionURL = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + instanceName + ";databaseName=" + database;
		
		Connection connection = DriverManager.getConnection(connectionURL, userName, password);
		return connection;
	}
}
