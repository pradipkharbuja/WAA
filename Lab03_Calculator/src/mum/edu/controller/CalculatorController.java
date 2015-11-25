package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.controller.Controller;
import mum.edu.validator.CalculatorValidator;

public class CalculatorController implements Controller {

	@AutoWired
	private CalculatorValidator validator;

	@RequestMapping(value = { "/calculator" })
	public String display(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator/display.jsp";
	}

	@RequestMapping(value = { "/calculate" })
	public String calculate(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {

		List<String> errors = validator.validate(calculator);
		System.out.println(calculator);

		if (errors.isEmpty()) {
			// store product in a scope variable for the view
			request.setAttribute("calculator", calculator);
			request.setAttribute("sum", calculator.getAdd1() + calculator.getAdd2());
			request.setAttribute("product", calculator.getProd1() + calculator.getProd2());
			return "/WEB-INF/jsp/calculator/result.jsp";
		} else {
			request.setAttribute("errors", errors);
			request.setAttribute("calculator", calculator);
			return "/WEB-INF/jsp/calculator/display.jsp";
		}
	}
}
