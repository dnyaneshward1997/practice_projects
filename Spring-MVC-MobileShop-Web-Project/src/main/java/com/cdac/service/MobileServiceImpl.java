package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.MobileDao;
import com.cdac.model.Mobile;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileDao mobileDao;

	@Override
	public void insert(Mobile mobile) {
		mobileDao.save(mobile);

	}

	@Override
	public void update(Mobile mobile) {
		mobileDao.modify(mobile);

	}

	@Override
	public void deleteById(int id) {
		mobileDao.deleteById(id);

	}

	@Override
	public Mobile getById(int id) {

		return mobileDao.selectById(id);
	}

	@Override
	public List<Mobile> getAll() {

		return mobileDao.selectAll();
	}

	@Override
	public void upload(int id, String image) {
		mobileDao.upload(id, image);

	}

}
