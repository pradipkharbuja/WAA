package mum.edu.cs;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.data.DataFacade;

@WebServlet("/AdviceServlet")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("advice", true);

		String roast = request.getParameter("roast");

		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advices = data.getAdvice(roast);

		request.setAttribute("roast", roast.toUpperCase());
		request.setAttribute("advices", advices);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("../advice.jsp");
		requestDispatcher.forward(request, response);
	}
}
