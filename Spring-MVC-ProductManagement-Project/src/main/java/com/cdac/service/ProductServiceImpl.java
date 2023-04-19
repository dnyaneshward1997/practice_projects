package com.cdac.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdac.dao.ProductDao;
import com.cdac.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	public void add(Product product) {
		productDao.save(product);
	}

	@Override
	public void modify(Product product) {
		productDao.update(product);
	}

	@Override
	public void deleteById(int id) {
		productDao.deleteById(id);
	}

	@Override
	public Product getById(int id) {
		return productDao.getById(id);
	}

	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}

	@Override
	public void upload(int id, String image) {
		productDao.upload(id, image);
	}

}
