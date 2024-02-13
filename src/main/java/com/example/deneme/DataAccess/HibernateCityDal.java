package com.example.deneme.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.deneme.Entities.City;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;


@Repository
public class HibernateCityDal implements IDao{
	
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public HibernateCityDal() {}

	@Override
	@Transactional
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(city);
	}

	@Override
	@Transactional
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete = session.get(City.class, city.getCityID());
		session.remove(cityToDelete);
		
	}

	@Override
	@Transactional
	public List<City> read() {
		Session session = entityManager.unwrap(Session.class);
		List<City> cities = session.createQuery("from City", City.class).getResultList();
		return cities;
	}

	@Override
	@Transactional
	public City readWithId(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city = session.get(City.class, id);
		return city;
	}

}
