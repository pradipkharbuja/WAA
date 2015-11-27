package edu.mum.waa.starbucks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.waa.starbucks.model.User;
import edu.mum.waa.starbucks.service.LoginSevice;
import edu.mum.waa.starbucks.service.RoastService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	private LoginSevice loginService;

	@Autowired
	private RoastService roastService;

	@RequestMapping(value = { "/", "/index" })
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User user, Model model) {
		if (loginService.checkValidUser(user)) {
			model.addAttribute("user", user.getUsername());
		}
		return "index";
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

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(SessionStatus status) {
		status.setComplete();
		return "redirect:/";
	}
}
