package waa.lab1.starbuck;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import waa.lab1.starbuck.data.DataFacade;
import waa.lab1.starbuck.data.TestDataImpl;

/**
 * Servlet implementation class RoastCoffee
 */
@WebServlet("/RoastCoffee")
public class RoastCoffee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String roast = request.getParameter("roast");

		DataFacade dataFacade = new TestDataImpl();

		String result = "<!DOCTYPE html><html><head><title>Result Page</title></head><body>" + "Starbuck's "
				+ roast.toUpperCase() + " Roast Coffees:";

		List<String> listOfCoffee = dataFacade.listOfCoffee(roast);
		if (listOfCoffee.size() > 0) {
			result += "<table>";

			for (int i = 0; i < listOfCoffee.size(); i++) {
				result += String.format("<tr><td style=\"background-color:%s\">%s</td></tr>",
						(i % 2 == 0) ? "cyan" : "yellow", listOfCoffee.get(i));
			}

			result += "<table>";
		}

		result += "<form method=\"POST\" action=\"LoggedInServlet\"><input type=\"submit\" value=\"Back\"></form>";
		result += "</body></html>";

		PrintWriter writer = response.getWriter();
		writer.write(result);
	}

}
