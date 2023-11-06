package Test;

import java.sql.Connection;
import java.sql.SQLException;

import Connection.ConnectionUtil;

public class Test {
	public static void main(String[] args) {
		try {
			Connection connection = ConnectionUtil.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
