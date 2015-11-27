package edu.mum.waa.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String indexPost(Model model, Calculator calculator,
			RedirectAttributes redirectAttributes) {
		System.out.println(calculator);

		List<String> errors = calculatorValidator.validate(calculator);

		model.addAttribute("errors", errors);

		if (errors.size() != 0) {
			return "display";
		} else {
			redirectAttributes.addFlashAttribute("calculator", calculator);
			return "redirect:/result";
		}
	}

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(Model model) {
		if (model.asMap().size() == 0) {
			return "redirect:/";
		}
		return "result";
	}
}
