package edu.mum.waa.starbucks.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.waa.starbucks.model.DataFacade;

public class LoginServiceImpl implements LoginSevice {

	@Autowired
	private DataFacade dataFacade;

	@Override
	public boolean checkValidUser(String username, String password) {

		String expectedPassword = dataFacade.findPassword(username);
		if (expectedPassword.equals(password)) {
			return true;
		}

		return false;
	}

}
