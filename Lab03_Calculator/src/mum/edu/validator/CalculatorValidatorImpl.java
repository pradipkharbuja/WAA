package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {

	public List<String> validate(Object object) {
		List<String> errors = new ArrayList<String>();

		Calculator calculator = (Calculator) object;
		if (calculator.getAdd1() == null) {
			errors.add("Please first number to add.");
		}

		if (calculator.getAdd2() == null) {
			errors.add("Please second number to add.");
		}

		if (calculator.getProd1() == null) {
			errors.add("Please first number to product.");
		}

		if (calculator.getProd2() == null) {
			errors.add("Please second number to product.");
		}

		return errors;
	}
}
