package org.spring.controller;

import java.util.List;


import org.spring.entity.Chair;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springservice.ChairService;



@RequestMapping("chairController")
@Controller
public class ChairController {
	//控制器依赖于service
	@Autowired
	//@Qualifier("personService")
	private ChairService chairService;
	
	

	public void setChairService(ChairService chairService) {
		this.chairService = chairService;
	}
	@ResponseBody
	@RequestMapping(value="queryAllChair")
	public List<Chair> queryAllChair() {
		
		List<Chair> chair= chairService.queryAllChair();
		System.out.println(chair);
		return chair;
		
		
	}
	@RequestMapping(value="updateChairById")
	@ResponseBody
	public boolean updateChairById(Chair chair) {
		
		
		chairService.updateChairById(chair);
		
		return true;
		
		
	}
	
	@RequestMapping(value="deleteChairById/{c_id}")
	@ResponseBody
	public boolean deleteChairById(@PathVariable("c_id") Integer c_id) {
		
		
		chairService.deleteChairById(c_id);
		
		return true;
		
		
	}
	@RequestMapping(value="insertChair")
	@ResponseBody
	public boolean insertChair(Chair chair) {
		
		
		chairService.insertChair(chair);
		
		return true;
		
		
	}
}
