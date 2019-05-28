package chapter04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter04_04
 */
@WebServlet(urlPatterns={"/Servlet_Training/Chapter05_02"})
public class Chapter04_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out = response.getWriter();
		//out.println("<!DOCTYPE html>");
		//out.println("<head>");
		//out.println("<meta charset='UTF-8'>");
		//out.println("<title>Chapter04_04</title>");
		//out.println("</head>");
		//out.println("<body>");
		out.println("Chapter04 Question03\n");
		out.println("UTF-8で日本語を出力します。");
		out.println("MIMEタイプはtext/htmlなのでブラウザは文書として認識しており、");
		out.println("<br>タグを使わないと改行されません。");
		//out.println("</body>");
		//out.println("</html>");
	}

}
