package com.cdac.service;

import java.util.List;
import com.cdac.model.Product;

public interface ProductService {

	void add(Product product);

	void modify(Product product);

	void deleteById(int id);

	Product getById(int id);

	List<Product> getAll();

	void upload(int id, String image);

}
