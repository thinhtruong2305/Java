<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="Beans.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! List<Product> products = null; %>
	<%

	
		String user = "sa";
		String password = "Thinhyeuhocbai123";
		String hostName = "localhost";
		String instanceName = "DESKTOP-J98APIA/SQLEXPRESS";
		String database = "Product";
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://" + hostName + ":1433" + ";instance=" + instanceName + ":databaseName=" + database;
	%>
	<%
		Connection connection = null;
		ResultSet resultSet = null;
		try{
			connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			String query = "SELECT * FROM [Product].[dbo].[PRODUCT]";
			resultSet = statement.executeQuery(query);
			products = new ArrayList<Product>();
			
			while(resultSet.next()){
				products.add(new Product(resultSet.getString("CODE"), resultSet.getString("NAME"), resultSet.getFloat("PRICE")));
			}
			
			System.out.println(connection.toString());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				connection.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				resultSet.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			request.setAttribute("list", products);
		}
	%>
	<div align="center">
		<table border="1">
			<caption>List of Product</caption>
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
			<c:forEach var="product" items="${list}">
				<tr>
					<td><c:out value="${product.code }"/></td>
					<td><c:out value="${product.name }"/></td>
					<td><c:out value="${product.price }"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>