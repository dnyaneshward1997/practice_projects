package com.cdac.dao;

import java.util.List;
import com.cdac.model.Product;

public interface ProductDao {

	void save(Product product);

	void update(Product product);

	void deleteById(int id);

	Product getById(int id);

	List<Product> getAll();

	void upload(int id, String image);

}
