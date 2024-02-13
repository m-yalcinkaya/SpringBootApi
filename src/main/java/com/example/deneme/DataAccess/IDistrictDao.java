package com.example.deneme.DataAccess;


import com.example.deneme.Entities.District;
import java.util.*;

public interface IDistrictDao {
	
	void add(District district);
	void delete(District district);
	List<District> read();
	District readWithId(int id);

}
