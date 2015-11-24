package waa.lab1.starbuck;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import waa.lab1.starbuck.data.DataFacade;
import waa.lab1.starbuck.data.TestDataImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username, password;
		username = req.getParameter("username");
		password = req.getParameter("password");

		DataFacade dataFacade = new TestDataImpl();
		
		if (dataFacade.checkLogin(username, password)) {
			RequestDispatcher view = req.getRequestDispatcher("login-success.html");
			view.forward(req, resp);
		} else {
			RequestDispatcher view = req.getRequestDispatcher("login-unsuccess.html");
			view.forward(req, resp);
		}
	}

}
