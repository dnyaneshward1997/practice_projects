package com.cdac.service;

import java.util.List;

import com.cdac.model.Mobile;

public interface MobileService {
	
	void insert(Mobile mobile);
	
	void update(Mobile mobile);
	
	void deleteById(int id);
	
	Mobile getById(int id);
	
	List<Mobile> getAll();
	
	void upload(int id, String image);



}
