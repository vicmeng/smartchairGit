package org.spring.controller;

import java.util.List;


import org.spring.entity.Chair;
import org.spring.entity.Count;
import org.spring.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springservice.ChairService;
import org.springservice.GuestService;



@RequestMapping("guestController")
@Controller
public class GuestController {
	//控制器依赖于service
	@Autowired
	
	private GuestService guestService;


	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	@ResponseBody
	@RequestMapping(value="queryAllGuest")
	public List<Guest> queryAllChair() {
		
		return guestService.queryAllGuest();	
	}
	
	@ResponseBody
	@RequestMapping(value="queryGuestById")
	public Guest queryGuestById() {
		
		return guestService.queryGuestById();	
	}
	
	@ResponseBody
	@RequestMapping(value="insertGuestById")
	public boolean insertGuestById(Guest guest) {
		guestService.insertGuestById(guest);	
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value="deleteGuestById/{r_id}")
	public boolean deleteGuestById(@PathVariable("g_id") Integer g_id) {
		guestService.deleteGuestById(g_id);	
		return true;
	}
	
	@ResponseBody
	@RequestMapping(value="updateGuestById")
	public boolean updateGuestById(Guest guest) {
		guestService.updateGuestById(guest);	
		return true;
	}
}
