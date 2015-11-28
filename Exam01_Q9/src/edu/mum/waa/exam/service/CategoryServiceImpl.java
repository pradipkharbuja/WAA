package edu.mum.waa.exam.service;

import java.util.ArrayList;
import java.util.List;

import edu.mum.waa.exam.model.Category;

public class CategoryServiceImpl implements CategoryService {

	private List<Category> categories = new ArrayList<>();

	public CategoryServiceImpl() {
		categories.add(new Category(1, "Computer"));
		categories.add(new Category(2, "Sports"));
	}

	@Override
	public List<Category> getAll() {
		return categories;
	}

	@Override
	public Category getCategory(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
