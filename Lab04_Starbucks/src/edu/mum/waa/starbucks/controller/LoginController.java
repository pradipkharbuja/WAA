package edu.mum.waa.starbucks.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.mum.waa.starbucks.service.LoginSevice;
import edu.mum.waa.starbucks.service.RoastService;

@Controller
public class LoginController {

	@Autowired
	private LoginSevice loginService;

	@Autowired
	private RoastService roastService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request) {
		String username = request.getParameter("name");
		String password = request.getParameter("password");

		if (username == "" || password == "") {
			return "index";
		} else if (loginService.checkValidUser(username, password)) {
			return "display";
		} else {
			return "index";
		}
	}

	@RequestMapping("/advice")
	public String advice(Model model) {
		model.addAttribute("advice", false);
		return "advice";
	}

	@RequestMapping(value = "/roast", method = RequestMethod.GET)
	public String adviceGet(Model model, @RequestParam("roast") String roast) {
		model.addAttribute("advices", roastService.getAdvice(roast));
		model.addAttribute("advice", true);
		return "advice";
	}
}
