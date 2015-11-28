package edu.mum.waa.exam.model;

public class Product {

	private int productId;
	private Category category;

	private String name, description;
	private double price;

	public Product() {
	}

	public Product(int productId, Category category, String name, double price) {
		super();
		this.productId = productId;
		this.category = category;
		this.name = name;
		this.description = "test";
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
