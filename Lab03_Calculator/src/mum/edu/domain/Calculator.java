package mum.edu.domain;

import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.controller.Controller;

public class Calculator implements Controller {

	@RequestMapping(value = { "/calculator" })
	public String display() {
		return "/WEB-INF/jsp/calculator/display.jsp";
	}
}
