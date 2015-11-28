package edu.mum.waa.exam.service;

import java.util.List;

import edu.mum.waa.exam.model.Product;

public interface ProductService {

	List<Product> getByCategory(int categoryId);

	void save(Product product);
}
