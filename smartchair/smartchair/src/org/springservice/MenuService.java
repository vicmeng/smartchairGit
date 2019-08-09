package org.springservice;

import java.util.List;

import org.spring.entity.Menu;

public interface MenuService {
	List<Menu> queryAllMenu();

	void updateMenuById(Menu menu);
	

	
	void deleteMenuById(int m_id);
	
	void insertMenu(Menu menu);
}
