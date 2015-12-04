package edu.mum.waa.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping("/source")
	public String getSource(@RequestParam("pass") String passValue, Model model) {
		model.addAttribute("value", passValue);
		return "redirect:/target?va=" + passValue;
	}

	@RequestMapping("/target")
	public String getTarget(@RequestParam("value") String passValue, Model model) {
		model.addAttribute("pass", passValue);
		return "display";
	}
}
