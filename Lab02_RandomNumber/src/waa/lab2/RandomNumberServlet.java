package waa.lab2;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RandomNumberServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random random = new Random();

		int first, second, third, fourth;
		int max = 10;

		first = random.nextInt(max);
		second = random.nextInt(max);
		third = random.nextInt(max);
		fourth = random.nextInt(max);

		request.setAttribute("first", first);
		request.setAttribute("second", second);
		request.setAttribute("third", third);
		request.setAttribute("fourth", fourth);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/result.jsp");
		requestDispatcher.forward(request, response);
	}

}
