package org.springservice;

import java.util.List;

import org.spring.entity.Chair;
import org.spring.entity.Count;


public interface ChairService {
	List<Chair> queryAllChair();

	void updateChairById(Chair chair);
	
	List<Count> queryChairStateCount();
	
	void deleteChairById(int c_id);
	
	void insertChair(Chair chair);
}
