package wqh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wqh.Book;
import wqh.Author;

public class Querybook extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	private static final long serialVersionUID = 1L;
	/*public QueryBook() {
		super();
	}
		
	/**
	 * Destruction of the servlet. 
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "queryshow.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		List<String> list=new ArrayList<String>();
		Author bookname = new Author();
		String name = request.getParameter("name").trim();
		bookname=Database.QueryName(name);
		String authorid = bookname.getAuthorid();
		list = Database.QueryBooks(authorid);
		request.setAttribute("list", list);
		
	    RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;
	}


	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

