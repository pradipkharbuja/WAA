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
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.write("TEST");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstNumber, secondNumber, thirdNumber, fourthNumber;

		firstNumber = request.getParameter("firstNumber");
		secondNumber = request.getParameter("secondNumber");
		thirdNumber = request.getParameter("thirdNumber");
		fourthNumber = request.getParameter("fourthNumber");

		PrintWriter writer = response.getWriter();

		
		writer.write("<!DOCTYPE html>" +
		"<html>		<head>		<meta charset=\"UTF-8\">		<title>Calculator</title>" +
		"<link rel=\"stylesheet\" href=\"resources/style.css\"> 		</head>		<body> "+
			"<form action=\"ImprovedCalculatorServlet\" method=\"POST\">");
		
		
				"<p><input type=\"number\" class=\"text-box\" name=\"firstNumber\" value=\"" + \"> + <input
						type="number" class="text-box" name="secondNumber"> = <input
						type="number" class="text-box" name="sumResult">
				</p>
				<p>
					<input type="number" class="text-box" name="thirdNumber"> * <input
						type="number" class="text-box" name="fourthNumber"> = <input
						type="number" class="text-box" name="productResult">
				</p>
				<input type="submit" value="Submit">
			</form>

		</body>
		</html>
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (!(firstNumber.isEmpty() || secondNumber.isEmpty())) {
			int sum = Integer.parseInt(firstNumber)
					+ Integer.parseInt(secondNumber);
			writer.write(String.format("<p>%s + %s = %s</p>", firstNumber,
					secondNumber, sum));
		}

		if (!(thirdNumber.isEmpty() || fourthNumber.isEmpty())) {
			int product = Integer.parseInt(thirdNumber)
					* Integer.parseInt(fourthNumber);
			writer.write(String.format("<p>%s + %s = %s</p>", thirdNumber,
					fourthNumber, product));
		}

	}

}
