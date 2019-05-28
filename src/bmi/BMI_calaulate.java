package bmi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMI_calaulate
 */
@WebServlet(urlPatterns={"/bmi/BMI_result"})
public class BMI_calaulate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		double height=0;
		double weight=0;
		double bmi_result=0;
		double std_weight=0;
		try{
			height=Double.parseDouble(request.getParameter("height"));
			weight=Double.parseDouble(request.getParameter("weight"));
			std_weight = 22*(height/100)*(height/100);
			bmi_result = weight / ((height/100) * (height/100));

			request.setAttribute("bmi_result", bmi_result);
			request.setAttribute("std_weight", std_weight);
			request.getRequestDispatcher("BMI_result.jsp").forward(request, response);

		}catch(Exception e){
			e.printStackTrace();
			System.out.println(height);
			System.out.println(weight);
			System.out.println(std_weight);
			System.out.println(bmi_result);
			System.out.println("error!!");
			PrintWriter out = response.getWriter();
			out.println("<h1>Error!!</h1>");
			out.println("<a href='/Servlet_Training/bmi/BMI_input.jsp'>前に戻る</a>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
