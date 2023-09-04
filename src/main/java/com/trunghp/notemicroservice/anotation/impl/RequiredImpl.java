package com.trunghp.notemicroservice.anotation.impl;

import com.trunghp.notemicroservice.anotation.Required;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RequiredImpl implements ConstraintValidator<Required, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value != null && value.length() > 0;
	}

}
