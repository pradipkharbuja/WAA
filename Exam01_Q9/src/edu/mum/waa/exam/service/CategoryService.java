package edu.mum.waa.exam.service;

import java.util.List;

import edu.mum.waa.exam.model.Category;

public interface CategoryService {
	List<Category> getAll();

	Category getCategory(int id);
}
