package com.cdac.dao;

import java.util.List;

import com.cdac.model.Mobile;

public interface MobileDao {
	
	void save(Mobile mobile);
	
	void modify(Mobile mobile);
	
	void deleteById(int id);
	
	Mobile selectById(int id);
	
	List<Mobile> selectAll();
	
		
	void upload (int id, String image);

}
