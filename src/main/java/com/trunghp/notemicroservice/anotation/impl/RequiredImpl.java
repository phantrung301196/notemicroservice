package com.trunghp.notemicroservice.anotation.impl;

import com.trunghp.notemicroservice.anotation.Required;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;

public class RequiredImpl implements ConstraintValidator<Required, Object> {
	public RequiredImpl() {
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value == null) {
			return false;
		} else {
			if (value instanceof String) {
				String text = value.toString();
				return StringUtils.hasText(text);
			} else if (value instanceof Collection) {
				Collection<?> collection = (Collection) value;
				return !CollectionUtils.isEmpty(collection);
			} else {
				return !ObjectUtils.isEmpty(value);
			}
		}
	}

}
