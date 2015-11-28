package edu.mum.waa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.mum.waa.exam.model.Category;
import edu.mum.waa.exam.service.CategoryService;

@Controller
@SessionAttributes("category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping(value = { "/", "/categories" }, method = RequestMethod.GET)
	public String list(Model model) {
		List<Category> categories = categoryService.getAll();
		model.addAttribute("categories", categories);
		return "categories";
	}

	@RequestMapping(value = "/categories/selectCategory")
	public String select(@RequestParam("categoryId") int id, Model model) {

		Category category = categoryService.getCategory(id);
		model.addAttribute("category", category); // add session

		return "forward:/listProductsByCategory";
	}
}
