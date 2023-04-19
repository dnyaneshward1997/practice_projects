package com.cdac.dao;

import java.util.List;

import com.cdac.model.Car;


public interface CarDao {
	
	public void save(Car car);

	public void update(Car car);

	public void deleteById(int id);

	public Car selectById(int id);

	public List<Car> selectAll();

	public void upload(int id, String image);
}
