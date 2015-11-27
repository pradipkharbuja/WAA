package edu.mum.waa.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.waa.calculator.model.Calculator;
import edu.mum.waa.calculator.validator.CalculatorValidator;

@Controller
public class CalculatorController {

	@Autowired
	private CalculatorValidator calculatorValidator;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "display";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String indexPost(Model model, Calculator calculator) {
		System.out.println(calculator);

		List<String> errors = calculatorValidator.validate(calculator);

		model.addAttribute("errors", errors);

		if (errors.size() != 0) {
			return "display";
		} else {
			model.addAttribute("calculator", calculator);
			model.addAttribute("sum", calculator.getAdd1() + calculator.getAdd2());
			model.addAttribute("product", calculator.getProd1() + calculator.getProd2());

			return "result";
		}
	}
}
