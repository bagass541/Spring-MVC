package com.bagas.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator 
	implements ConstraintValidator<CheckEmail, String> {

	private String endOfEmail;
	
	@Override
	public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return enteredValue.endsWith(endOfEmail);
	}

	@Override
	public void initialize(CheckEmail checkEmail) {
		// TODO Auto-generated method stub
		endOfEmail = checkEmail.value();
	}
	
	

}
