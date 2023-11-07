package Connection;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		// Ở đây tôi kết nối tới Oracle Database.
		// (Bạn có thể thay đổi sử dụng database khác).
		return SQLServerJDBC.getSQLServerConnection_JDBC();
				
		// return Oracle.getOracleConnection();
		// return MySQL.getMySQLConnection();
		// return SQLServerJTDS.getSQLServerConnection_JTDS();
		// return SQLServerJDBC.getSQLServerConnection_JDBC();
		// return PostGres.getPostGresConnection();
	}
	
	public static void closeQuietly(Connection connection) {
		try {
			connection.close();
		}catch (Exception e) {}
	}
	
	public static void rollbackQuietly(Connection connection) {
		try {
			connection.rollback();
		}catch (Exception e) {}
	}
}
