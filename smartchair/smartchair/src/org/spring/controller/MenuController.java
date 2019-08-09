package org.spring.controller;

import java.util.List;
import java.util.Map;

import org.spring.entity.Menu;
import org.spring.entity.Person;
import org.spring.service.impl.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springservice.MenuService;
import org.springservice.PersonService;


@RequestMapping("menuController")
@Controller
public class MenuController {
	//控制器依赖于service
	@Autowired
	//@Qualifier("personService")
	private MenuService menuService;
	
	

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}


	@ResponseBody
	@RequestMapping(value="queryAllMenu")
	public List<Menu> queryAllMenu() {
		
		List<Menu> menu= menuService.queryAllMenu();
		System.out.println(menu);
		return menu;
		
		
	}
	@RequestMapping(value="updateMenuById")
	@ResponseBody
	public boolean updateMenuByIdWithTure(Menu menu) {
		
		
		menuService.updateMenuById(menu);
		
		return true;
		
		
	}
	
	@RequestMapping(value="deleteMenuById/{m_id}")
	@ResponseBody
	public boolean deleteMenuById(@PathVariable("m_id") Integer m_id) {
		
		
		menuService.deleteMenuById(m_id);
		
		return true;
		
		
	}
	@RequestMapping(value="insertMenu")
	@ResponseBody
	public boolean insertMenu(Menu menu) {
		
		
		menuService.insertMenu(menu);
		
		return true;
		
		
	}
}
