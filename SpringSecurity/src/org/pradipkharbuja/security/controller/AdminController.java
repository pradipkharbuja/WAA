package org.pradipkharbuja.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "test";
	}
}
