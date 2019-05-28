package chapter04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter04_02
 */
@WebServlet(urlPatterns={"/Servlet_Training/Chapter04_02/timestamp"})
public class Chapter04_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		Chapter04_01.headHtml(out, "Chapter04_02");
		out.println("<h1>Chapter04 Question02</h1>");
		out.println("<p>now Time :"+new java.util.Date()+" </p>");
		Chapter04_01.footHtml(out);
		
	}

}
