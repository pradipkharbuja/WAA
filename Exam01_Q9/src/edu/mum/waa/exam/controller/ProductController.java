package edu.mum.waa.exam.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import edu.mum.waa.exam.model.Category;
import edu.mum.waa.exam.model.Product;
import edu.mum.waa.exam.service.ProductService;

@SessionAttributes("category")
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/listProductsByCategory")
	private String listProducts(@RequestParam("categoryId") int categoryId, Model model) {

		List<Product> list = productService.getByCategory(categoryId);
		model.addAttribute("products", list);

		return "listProducts";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	private String inputProduct() {
		return "productForm";
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String saveProduct(Product product, Map map, SessionStatus status) {
		Category category = (Category) map.get("category");
		product.setCategory(category);
		productService.save(product);

		status.setComplete();

		return "productDetails";
	}
}
