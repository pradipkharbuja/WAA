package edu.mum.waa.starbucks.model;

import java.util.List;

public interface DataFacade {
	public String findPassword(String name);

	public List<String> getAdvice(String roast);
}
