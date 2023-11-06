package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utils.*;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/other/forwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Lấy giá trị tham số (parameter) trên URL.
		String forward = request.getParameter("forward");

		if ("true".equals(forward)) {
			System.out.println("Forward to ShowMeServlet");

			// Set dữ liệu vào thuộc tính (attribute) của request.
			request.setAttribute(Constants.ATTRIBUTE_USER_NAME_KEY, "Hi, I'm Tom come from Walt Disney !");

			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/showMe");
			dispatcher.forward(request, response);
					
			return;
		}
		
		ServletOutputStream out = response.getOutputStream();
		out.println("<h3>Text of ForwardDemoServlet</h3>");
		out.println("- servletPath=" + request.getServletPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

