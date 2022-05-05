package com.fatihcakir.simpleService.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatihcakir.simpleService.business.abstracts.SimpleService;
import com.fatihcakir.simpleService.dataAccess.SimpleDao;
import com.fatihcakir.simpleService.entity.Simple;


@Service
public class SimpleManager implements SimpleService{
	
	//dependencies
	private SimpleDao simpleDao;
	
	
	@Autowired
	public SimpleManager(SimpleDao simpleDao) {
		super();
		this.simpleDao = simpleDao;
	}

	@Override
	public List<Simple> getAll() {
		
		List<Simple> result = this.getAll();
		
		return result;
	}

	@Override
	public Simple getById(int id) {
		
		Simple result = this.getById(id);
		
		return result;
	}

	@Override
	public Simple add(Simple simple) {
		
		Simple saved = this.simpleDao.save(simple);
		
		return saved;
	}

}
