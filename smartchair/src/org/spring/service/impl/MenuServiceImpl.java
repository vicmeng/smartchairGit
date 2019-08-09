package org.spring.service.impl;

import java.util.List;

import org.spring.entity.Menu;
import org.spring.mapper.MenuMapper;
import org.springservice.MenuService;

public class MenuServiceImpl implements MenuService{
	
	private MenuMapper menuMapper;

	public MenuMapper getMenuMapper() {
		return menuMapper;
	}

	public void setMenuMapper(MenuMapper menuMapper) {
		this.menuMapper = menuMapper;
	}

	@Override
	public List<Menu> queryAllMenu() {
		
		return menuMapper.queryAllMenu();
	}

	@Override
	public void updateMenuById(Menu menu) {
		menuMapper.updateMenuById(menu);
		
	}
	
	
	
	@Override
	public void deleteMenuById(int m_id) {
		menuMapper.deleteMenuById(m_id);
		
	}

	@Override
	public void insertMenu(Menu menu) {
		
		System.out.println(menu);
		menuMapper.insertMenu(menu);
		
		
	}
	
	
	

	
	
}
