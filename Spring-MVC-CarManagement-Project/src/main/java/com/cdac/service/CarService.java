package com.cdac.service;

import java.util.List;

import com.cdac.model.Car;


public interface CarService {
	
	public void add(Car car);

	public void modify(Car car);

	public void removeById(int id);

	public Car getById(int id);

	public List<Car> getAll();

	public void upload(int id, String image);
	
}
