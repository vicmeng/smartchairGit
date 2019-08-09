package org.spring.controller;

import java.util.Map;

import org.spring.entity.Person;
import org.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springservice.PersonService;
import org.springservice.UserService;

@RequestMapping("userController")
@Controller
public class UserController {
	//控制器依赖于service
	@Autowired
	//@Qualifier("personService")
	private UserService userService;
	



	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping("queryUserById/{u_id}")
	public String queryPersonById(@PathVariable("u_id") Integer u_id,Map<String, Object> map) {
		
		User user= userService.queryUserById(u_id);
		System.out.println(user);
		map.put("user",user);
		return "result";
	}
}
