package com.example.deneme.DataAccess;

import com.example.deneme.Entities.*;
import java.util.*;

public interface IDao {
	void add(City city);
	void delete(City city);
	List<City> read();
	City readWithId(int id);
}
