package com.cdac.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.cdac.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Product product) {
		hibernateTemplate.execute(session -> {
			Transaction tx = session.beginTransaction();
			session.save(product);
			tx.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	@Override
	public void update(Product product) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.update(product);
			t.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	@Override
	public void deleteById(int id) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.delete(new Product(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	@Override
	public Product getById(int id) {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Product product = (Product) session.get(Product.class, id);
			t.commit();
			session.flush();
			session.close();
			return product;
		});
	}

	@Override
	public List<Product> getAll() {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Query q = session.createQuery("from Product");
			List<Product> lst = q.list();
			t.commit();
			session.flush();
			session.close();
			return lst;
		});
	}
	
	@Override
	public void upload(int id, String image) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Product product = (Product) session.get(Product.class, id);
			product.setImage(image);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}
}
