package com.fatihcakir.simpleService.business.abstracts;

import java.util.List;

import com.fatihcakir.simpleService.entity.Simple;

public interface SimpleService {

	List<Simple> getAll();
	
	Simple getById(int id);
	
	Simple add(Simple simple);
	
	
}
