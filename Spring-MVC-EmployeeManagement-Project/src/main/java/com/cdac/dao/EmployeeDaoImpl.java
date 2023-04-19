package com.cdac.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(Employee employee) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.save(employee);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	@Override
	public void update(Employee employee) {
		hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			session.update(employee);
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
			session.delete(new Employee(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});
	}

	@Override
	public Employee selectById(int id) {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Employee employee = (Employee) session.get(Employee.class, id);
			t.commit();
			session.flush();
			session.close();
			return employee;
		});
	}

	@Override
	public List<Employee> selectAll() {
		return hibernateTemplate.execute(session -> {
			Transaction t = session.beginTransaction();
			Query q = session.createQuery("from Employee");
			List<Employee> lst = q.list();
			t.commit();
			session.flush();
			session.close();
			return lst;
		});
	}

}
