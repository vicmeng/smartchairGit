package org.spring.service.impl;

import org.spring.entity.Person;
import org.spring.mapper.PersonMapper;
import org.springservice.PersonService;

public class PersonServiceImpl implements PersonService{
	
	private PersonMapper personMapper;
	
	public PersonMapper getPersonMapper() {
		return personMapper;
	}

	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	@Override
	public Person queryPersonById(int id) {
		return personMapper.queryPersonById(id);
		
	}
	
}
