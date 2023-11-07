package Util;

import java.sql.Connection;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.Account;

public class MyUtil {
	public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
	private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_USER_NAME_IN_COOKIE";
	
	// Lưu trữ Connection vào attribute của request.
	// Thông tin lưu trữ này chỉ tồn tại trong thời gian yêu cầu (request)
	// cho tới khi dữ liệu được trả về trình duyệt người dùng.
	public static void storeConnection(ServletRequest request, Connection connection) {
		request.setAttribute(ATT_NAME_CONNECTION, connection);
	}
	
	// Lấy đối tượng Connection đã được lưu trữ trong attribute của request.
	public static Connection getStoreConnection(ServletRequest request) {
		Connection connection = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
		return connection;
	}
	
	// Lưu trữ thông tin người dùng đã login vào Session.
	public static void storeLoginedUser(HttpSession session, Account user) {
		session.setAttribute("loginedUser", user);
	}
	
	// Lấy thông tin người dùng lưu trữ trong Session.
	public static Account getLoginedUser(HttpSession session) {
		Account loginedUser = (Account) session.getAttribute("loginedUser");
		return loginedUser;
	}
	
	// Lưu thông tin người dùng vào Cookie.
	public static void storeUserCookie(HttpServletResponse response, Account user) {
		System.out.println("Store user cookie");
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getUserName());
		//1 ngày đổi ra giây
		cookieUserName.setMaxAge(24 * 60 * 60);
		response.addCookie(cookieUserName);
	}
	
	public static String getUserNameInCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(Cookie cookie : cookies) {
				if(ATT_NAME_USER_NAME.equals(cookie.getName()))
					return cookie.getValue();
			}
		}
		return null;
	}
	
	// Xóa Cookie của người dùng
	public static void deleteUserCookie(HttpServletResponse response) {
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
		// 0 giây. (Cookie này sẽ hết hiệu lực ngay lập tức)
		cookieUserName.setMaxAge(0);
		response.addCookie(cookieUserName);
	}
}
