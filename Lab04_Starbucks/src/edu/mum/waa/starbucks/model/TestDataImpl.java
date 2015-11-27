package edu.mum.waa.starbucks.model;

import java.util.List;

public class TestDataImpl implements DataFacade {

	private static final Database data = new Database();

	public String findPassword(String name) {
		String expectedPassword = data.getPassword(name);
		return expectedPassword;
	}
	public List<String> getAdvice(String roast) { 
		return data.getAdvice(roast);
	}
}
