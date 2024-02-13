package com.example.deneme.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.deneme.Entities.City;
import jakarta.transaction.Transactional;
import com.example.deneme.DataAccess.*;

@Repository
public class CityManager implements ICityManager{

	private IDao dao;
	
	@Autowired
	public CityManager(IDao dao) {
		this.dao = dao;
	}
	
	public CityManager() {}
	
	@Override
	@Transactional
	public void add(City city) {
		this.dao.add(city);
		
	}

	@Override
	@Transactional
	public void delete(City city) {
		this.dao.delete(city);
		
	}

	@Override
	@Transactional
	public List<City> read() {
		return this.dao.read();
	}

	@Override
	@Transactional
	public City readWithId(int id) {
		return this.dao.readWithId(id);
	}

	
	
}
