package edu.mum.waa.starbucks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.waa.starbucks.model.DataFacade;

public class RoastServiceImpl implements RoastService {

	@Autowired
	private DataFacade dataFacade;

	@Override
	public List<String> getAdvice(String roast) {
		return dataFacade.getAdvice(roast);
	}

}
