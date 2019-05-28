package chapter04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.ResolutionSyntax;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter04_01
 */
@WebServlet(urlPatterns={"/Servlet_Training/Chapter04_01"})
public class Chapter04_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		headHtml(out, "Chapter04");
		out.println("<h1>Chapter04 Question01</h1>");
		out.println("<p>HelloServlet</p>");
		footHtml(out);
		
	}
	public static void headHtml(PrintWriter out, String title){
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head >");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>"+title+"</title>");
		out.println("</head>");
		out.println("<body>");
	}
	public static void footHtml(PrintWriter out){
		out.println("</body>");
		out.println("</html>");
	}

}
