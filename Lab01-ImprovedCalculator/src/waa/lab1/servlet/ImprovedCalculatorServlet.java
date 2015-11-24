package waa.lab1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalulatorServlet
 */
@WebServlet("/ImprovedCalculatorServlet")
public class ImprovedCalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ImprovedCalculatorServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.write("TEST");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstNumber, secondNumber, thirdNumber, fourthNumber;

		firstNumber = request.getParameter("firstNumber");
		secondNumber = request.getParameter("secondNumber");
		thirdNumber = request.getParameter("thirdNumber");
		fourthNumber = request.getParameter("fourthNumber");

		String sum = "";
		if (!(firstNumber.isEmpty() || secondNumber.isEmpty())) {
			sum = "" + (Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
		}

		String product = "";
		if (!(thirdNumber.isEmpty() || fourthNumber.isEmpty())) {
			product = "" + (Integer.parseInt(thirdNumber) * Integer.parseInt(fourthNumber));
		}

		PrintWriter writer = response.getWriter();

		writer.write("<!DOCTYPE html>\n"
				+ "<html>\n		<head>\n		<meta charset=\"UTF-8\">\n		<title>Calculator</title>\n"
				+ "\t\t<link rel=\"stylesheet\" href=\"resources/style.css\">\n 		</head>\n		<body>\n "
				+ "<form action=\"ImprovedCalculatorServlet\" method=\"POST\">\n");

		writer.write(
				"<p><input type=\"number\" class=\"text-box\" name=\"firstNumber\" value=\"" + firstNumber + "\">");

		writer.write(
				" + <input type=\"number\" class=\"text-box\" name=\"secondNumber\" value=\"" + secondNumber + "\">");

		writer.write(" = <input type=\"number\" class=\"text-box\" name=\"sumResult\" value=\"" + sum + "\"></p>");

		writer.write(
				"<p><input type=\"number\" class=\"text-box\" name=\"thirdNumber\" value=\"" + thirdNumber + "\">");

		writer.write(
				" * <input type=\"number\" class=\"text-box\" name=\"fourthNumber\" value=\"" + fourthNumber + "\">");

		writer.write(
				" = <input type=\"number\" class=\"text-box\" name=\"productResult\" value=\"" + product + "\"></p>");

		writer.write("<input type=\"submit\" value=\"Submit\"></form></body></html>");

	}

}
