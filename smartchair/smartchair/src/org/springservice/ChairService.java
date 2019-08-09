package org.springservice;

import java.util.List;

import org.spring.entity.Chair;


public interface ChairService {
	List<Chair> queryAllChair();

	void updateChairById(Chair chair);
	

	
	void deleteChairById(int c_id);
	
	void insertChair(Chair chair);
}
