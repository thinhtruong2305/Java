package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Dept;
import Utils.DBUtils;

/**
 * Servlet implementation class DepartmentNotNullServlet
 */
@WebServlet("/DepartmentNotNullServlet")
public class DepartmentNotNullServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartmentNotNullServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//Truy vấn dữ liệu vào DB mô phỏng
		List<Dept> list = DBUtils.queryDepartments();
				
		//Lưu dữ liệu vào thuộc tính 'departments' của request
		request.setAttribute("departments", list);
				
		//Tạo đối tượng request dispatcher
		//Để Forward(Chuyển tiếp) yêu cầu tới Department.jsp RequestDispatcher
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/View/Foreach/DepartmentNotNull.jsp");
				
		//Forward(Chuyển tiếp) yêu cầu, để hiển thị lên trang JSP
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
