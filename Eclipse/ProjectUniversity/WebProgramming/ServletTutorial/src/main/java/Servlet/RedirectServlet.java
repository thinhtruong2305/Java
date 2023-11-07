package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/other/redirectServlet")
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		// Lấy ra giá trị của tham số (parameter) trên URL.
		String redirect = request.getParameter("redirect");

		if ("true".equals(redirect)) {
			System.out.println("Redirect to ShowMeServlet");

			// contextPath: Là một String rỗng "" hoặc khác rỗng.
			// Nếu khác rỗng, nó luôn bắt đầu bởi /
			// và không kết thúc bởi /
			String contextPath = request.getContextPath();

			// ==> /ServletTutorial/showMe
			response.sendRedirect(contextPath + "/showMe");
			return;
		}

		ServletOutputStream out = response.getOutputStream();
		out.println("<h3>Text of RedirectDemoServlet</h3>");
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
