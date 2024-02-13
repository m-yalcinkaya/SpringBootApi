package com.example.deneme.Business;


import java.util.*;
import com.example.deneme.Entities.*;

public interface ICityManager {

	void add(City city);
	void delete(City city);
	List<City> read();
	City readWithId(int id);
	
}
