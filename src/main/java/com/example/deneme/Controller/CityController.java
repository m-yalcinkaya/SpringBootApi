package com.example.deneme.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deneme.Business.*;
import java.util.*;
import com.example.deneme.Entities.*;


@RestController
@RequestMapping("/cities")
public class CityController {

	private ICityManager cityManager;
	
	@Autowired
	public CityController(ICityManager cityManager) {
		this.cityManager = cityManager;
	}
	
	
	public CityController() {}
	
	@GetMapping()
	public List<City> get(){
		return this.cityManager.read();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		this.cityManager.add(city);
	}
	
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		this.cityManager.delete(city);
	}
	
	@GetMapping("/{id}")
	public City readWithId(@PathVariable int id) {
		return this.cityManager.readWithId(id);
	}
	
}

