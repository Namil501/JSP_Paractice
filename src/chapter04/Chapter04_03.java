package chapter04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Chapter04_03
 */
@WebServlet(urlPatterns={"/Servlet_Training/Chapter04_03"})
public class Chapter04_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		Chapter04_01.headHtml(out, "Chapter04_03");
		out.print("<h1>Chapter04 Question03</h1>");
		out.print("<p>UTF-8で日本語を出力します。</p>");
		out.print("<label>MIMEタイプはtext/htmlなのでブラウザは文書として認識しており、</label>");
		out.print("<p>&lsaquo;br&rsaquo;タグを使わないと改行されません。</p>");
		Chapter04_01.footHtml(out);
	}

}
