package com.example.deneme.Business;


import com.example.deneme.Entities.*;
import java.util.*;

public interface IDistrictManager {
	
	void add(District district);
	void delete(District district);
	List<District> read();
	District readWithId(int id);

}
