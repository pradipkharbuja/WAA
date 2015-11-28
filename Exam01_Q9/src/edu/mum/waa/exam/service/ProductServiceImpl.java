package edu.mum.waa.exam.service;

import java.util.ArrayList;
import java.util.List;

import edu.mum.waa.exam.model.Product;

public class ProductServiceImpl implements ProductService {

	private List<Product> products = new ArrayList<>();

	private CategoryService categoryService = new CategoryServiceImpl();

	public ProductServiceImpl() {
		products.add(new Product(1, categoryService.getCategory(1), "Dell", 1000));
		products.add(new Product(2, categoryService.getCategory(1), "Lenovo", 900));
		products.add(new Product(3, categoryService.getCategory(2), "T-Shirt", 100));
		products.add(new Product(4, categoryService.getCategory(2), "Boots", 90));
		products.add(new Product(5, categoryService.getCategory(1), "Toshiba", 500));
	}

	@Override
	public List<Product> getByCategory(int categoryId) {
		List<Product> tempProducts = new ArrayList<>();

		for (Product product : products) {
			if (product.getCategory().getId() == categoryId) {
				tempProducts.add(product);
			}
		}

		return tempProducts;
	}

	@Override
	public void save(Product product) {
		products.add(product);
	}

}
