package Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Account;
import Beans.Product;

public class DBUtil {
	//User
	public static Account findUser(Connection connection, String userName, String password) throws SQLException {
		String query = "SELECT USER_NAME, GENDER, PASSWORD FROM [Product].dbo.[USER_ACCOUNT]  WHERE USER_NAME = ? AND PASSWORD = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userName);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			String gender = resultSet.getNString("GENDER");
			Account user = new Account();
			user.setUserName(userName);
			user.setPassword(password);
			user.setGender(gender);
			return user;
		}
		return null;
	}
	
	public static Account findUser(Connection connection, String userName) throws SQLException {
		String query = "SELECT USER_NAME, GENDER, PASSWORD FROM [Product].dbo.[USER_ACCOUNT]  WHERE USER_NAME = ?";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userName);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet != null) {
			String password = resultSet.getNString("PASSWORD");
			String gender = resultSet.getNString("GENDER");
			Account user = new Account();
			user.setUserName(userName);
			user.setPassword(password);
			user.setGender(gender);
			return user;
		}
		return null;
	}
	
	//Product
	public static List<Product> getAllProduct(Connection connection) throws SQLException {
		String query = "SELECT CODE, NAME, PRICE FROM [Product].[dbo].[PRODUCT]";
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		List<Product> list = new ArrayList<Product>();
		while(resultSet.next()) {
			String code = resultSet.getNString("CODE");
			String name = resultSet.getNString("NAME");
			float price = resultSet.getFloat("PRICE");
			Product product = new Product();
			product.setCode(code);
			product.setName(name);
			product.setPrice(price);
			list.add(product);
		}
		return list;
	}
	
	public static Product findProduct(Connection connection, String code) throws SQLException{
		
	}
}
