package com.fatihcakir.simpleService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatihcakir.simpleService.business.abstracts.SimpleService;
import com.fatihcakir.simpleService.entity.Simple;

@RestController
public class SimpleControllers {

	private SimpleService simpleService;

	
	@Autowired
	public SimpleControllers(SimpleService simpleService) {
		
		this.simpleService = simpleService;
	}
	
	
	@GetMapping("getAll")
	List<Simple> getAll(){
		
		List<Simple> result = simpleService.getAll();
		
		return result;
	}
	
	@GetMapping("getById")
	Simple getById(int id) {
		
		Simple result = simpleService.getById(id);
		
		return result;
	}
	
	@PostMapping("add")
	Simple add(Simple simple) {
		
		Simple saved = simpleService.add(simple);
		
		return saved;
	}
	
	
}
