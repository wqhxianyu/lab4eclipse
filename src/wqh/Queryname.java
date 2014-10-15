package wqh;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wqh.Author;

public class Queryname extends HttpServlet {


	private static final long serialVersionUID = 1L;
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "error.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		Author bookname = new Author();
		String name = request.getParameter("name").trim();
		if(name!=null){
			bookname=Database.QueryName(name);
			if(bookname.getAuthorid()!=null){
				url="nameshow.jsp";
				request.setAttribute("authorid", bookname.getAuthorid());
			}
			else{
			    request.setAttribute("message", "查询错误，输入正确的书号！");
			}
		}
		
	    RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;
	}


	public void init() throws ServletException {
		// Put your code here
	}

}
