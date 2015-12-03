package com.students.validataor;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.students.domain.Phone;

public class PhoneValidator implements Validator {

	@Override
	public void validate(Object object, Errors errors) {
		Phone phone = (Phone) object;
		if(phone.getArea() < 100 || phone.getArea() > 999){
			errors.reject("area", "Phone.area.invalid");
		}
	}

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}
