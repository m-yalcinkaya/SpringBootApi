package com.example.deneme.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.deneme.Entities.District;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class HibernateDistrictDal implements IDistrictDao{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateDistrictDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public HibernateDistrictDal() {}
	
	@Override
	@Transactional
	public void add(District district) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(district);
	}

	@Override
	@Transactional
	public void delete(District district) {
		Session session = entityManager.unwrap(Session.class);
		District districtToDelete = session.get(District.class, district.getCityID());
		session.remove(districtToDelete);
		
	}

	@Override
	@Transactional
	public List<District> read() {
		Session session = entityManager.unwrap(Session.class);
		List<District> districts = session.createQuery("from District", District.class).getResultList();
		return districts;
	}

	@Override
	@Transactional
	public District readWithId(int id) {
		Session session = entityManager.unwrap(Session.class);
		District district = session.get(District.class, id);
		return district;
	}

}
