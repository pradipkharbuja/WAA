package mum;

import java.io.IOException;
<<<<<<< HEAD
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
=======

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletParm
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Calculator() {
		super();

	}

<<<<<<< HEAD
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("calculator.jsp");
=======
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("calculator.jsp");
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
<<<<<<< HEAD
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
=======
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
		// TODO Auto-generated method stub
		String add1 = request.getParameter("add1").trim();
		String add2 = request.getParameter("add2").trim();
		String mult1 = request.getParameter("mult1").trim();
		String mult2 = request.getParameter("mult2").trim();

		String sum = "";
		String product = "";

		// Check for valid inputs....
		try {
			Integer a1 = Integer.parseInt(add1);
			Integer a2 = Integer.parseInt(add2);
			sum = "" + (a1 + a2);
		} catch (NumberFormatException e) {
			if (add1.isEmpty())
<<<<<<< HEAD
				add1 = "''";
			if (add2.isEmpty())
				add2 = "''";
			sum = "''";
=======
				add1 = "";
			if (add2.isEmpty())
				add2 = "";
			sum = "";
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
		}

		/*
		 * Integer.parseInt(str) throws NumberFormatException if the string
		 * cannot be converted to an integer.
		 */

		try {
			Integer m1 = Integer.parseInt(mult1);
			Integer m2 = Integer.parseInt(mult2);
			product = "" + (m1 * m2);
		} catch (NumberFormatException e) {
			if (mult1.isEmpty())
<<<<<<< HEAD
				mult1 = "''";
			if (mult2.isEmpty())
				mult2 = "''";
			product = "''";
=======
				mult1 = "";
			if (mult2.isEmpty())
				mult2 = "";
			product = "";
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
		}

		request.setAttribute("add1", add1);
		request.setAttribute("add2", add2);
		request.setAttribute("mult1", mult1);
		request.setAttribute("mult2", mult2);
<<<<<<< HEAD
		
		request.setAttribute("sum", sum);
		request.setAttribute("product", product);

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("result.jsp");
=======

		request.setAttribute("sum", sum);
		request.setAttribute("product", product);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
>>>>>>> e2279649dbe891a766f26d8653956b9f40938009
		requestDispatcher.forward(request, response);
	}

}
