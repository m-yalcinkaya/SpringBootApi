package com.example.deneme.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.deneme.DataAccess.IDistrictDao;
import com.example.deneme.Entities.District;

import jakarta.transaction.Transactional;

@Repository
public class DistrictManager implements IDistrictManager{

	private IDistrictDao districtDao;
	
	
	@Autowired
	public DistrictManager(IDistrictDao districtDao) {
		this.districtDao = districtDao;
	}

	@Override
	@Transactional
	public void add(District district) {
		this.districtDao.add(district);
	}

	@Override
	@Transactional
	public void delete(District district) {
		this.districtDao.delete(district);
		
	}

	@Override
	@Transactional
	public List<District> read() {
		return this.districtDao.read();
	}

	@Override
	@Transactional
	public District readWithId(int id) {
		return this.districtDao.readWithId(id);
	}

}
