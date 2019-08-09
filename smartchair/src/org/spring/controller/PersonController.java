package org.spring.controller;

import java.util.Map;

import org.spring.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springservice.PersonService;

@RequestMapping("personController")
@Controller
public class PersonController {
	//控制器依赖于service
	@Autowired
	//@Qualifier("personService")
	private PersonService personService;
	
	

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}



	@RequestMapping("queryPersonById/{id}")
	public String queryPersonById(@PathVariable("id") Integer id,Map<String, Object> map) {
		
		Person person= personService.queryPersonById(id);
		System.out.println(person);
		map.put("person",person);
		return "result";
		
	}
}
