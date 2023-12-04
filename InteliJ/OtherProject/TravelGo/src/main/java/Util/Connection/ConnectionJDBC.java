package Util.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static Connection getConnection_JDBC() throws SQLException, ClassNotFoundException{
        String userName = "root";
        String password = "Thinhyeumysql123";

        return getMySQLConnection_JDBC(userName, password);
    }
    public static Connection getMySQLConnection_JDBC(String userName, String password) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionURL = "jdbc:mysql://localhost:3306/travelgo";

        Connection connection = DriverManager.getConnection(connectionURL, userName, password);
        return connection;
    }
}
