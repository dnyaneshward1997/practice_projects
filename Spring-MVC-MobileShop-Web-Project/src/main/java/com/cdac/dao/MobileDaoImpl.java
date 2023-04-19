package com.cdac.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.model.Mobile;

@Repository
public class MobileDaoImpl implements MobileDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// insert
	@Override
	public void save(Mobile mobile) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.save(mobile);
			t.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	// update
	@Override
	public void modify(Mobile mobile) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.update(mobile);
			t.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	// delete
	@Override
	public void deleteById(int id) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.delete(new Mobile(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	@Override
	public Mobile selectById(int id) {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Mobile mobile = (Mobile) session.get(Mobile.class, id);
			t.commit();
			session.flush();
			session.close();
			return mobile;
		});
	}

	@Override
	public List<Mobile> selectAll() {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Query q = session.createQuery("from Mobile");
			List<Mobile> lst = q.list();
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
			Mobile mobile = (Mobile) session.get(Mobile.class, id);
			mobile.setImage(image);
			t.commit();
			session.flush();
			session.close();
			return null;
		});

	}

	

}
