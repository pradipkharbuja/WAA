package edu.mum.waa.starbucks.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.mum.waa.starbucks.model.DataFacade;
import edu.mum.waa.starbucks.model.User;

public class LoginServiceImpl implements LoginSevice {

	@Autowired
	private DataFacade dataFacade;

	@Override
	public boolean checkValidUser(User user) {

		String expectedPassword = dataFacade.findPassword(user.getUsername());
		if (expectedPassword.equals(user.getPassword())) {
			return true;
		}

		return false;
	}
}
