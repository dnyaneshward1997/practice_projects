package com.cdac.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.cdac.model.Product;

@Service
public class ProductValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.equals(Product.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name_err", "name required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "company", "company_err", "company required");

		Product product = (Product) target;
		if (product.getPrice() <= 0) {
			errors.rejectValue("price", "price_err", "price can not be 0 or less");
		}

	}

}
