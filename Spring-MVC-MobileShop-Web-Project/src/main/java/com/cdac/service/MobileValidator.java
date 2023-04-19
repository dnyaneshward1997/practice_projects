package com.cdac.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.model.Mobile;

@Service
public class MobileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.equals(Mobile.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "company", "company_err", "company required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "model_err", "model required");
		Mobile mobile = (Mobile) target;
		if (mobile.getPrice() <= 0) {
			errors.rejectValue("price", "price_err", "price can not be 0 or less");
		}
	}

}
