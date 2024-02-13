package com.example.deneme.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.deneme.Entities.*;
import com.example.deneme.Business.IDistrictManager;
import java.util.*;

@RestController
@RequestMapping("/districts")
public class DistrictController {

	private IDistrictManager districtManager;
	
	@Autowired
	public DistrictController(IDistrictManager districtManager) {
		this.districtManager = districtManager;
	}
	
	@GetMapping()
	public List<District> getAll(){
		return this.districtManager.read();
	}
	
	@GetMapping("/{id}")
	public District getById(@PathVariable int id) {
		return this.districtManager.readWithId(id);
	}
	
	
	@PostMapping("/delete")
	public void delete(@RequestBody District district) {
		this.districtManager.delete(district);
	}
	
	
	@PostMapping("/add")
	public void add(@RequestBody District district) {
		this.districtManager.add(district);
	}
}
