package org.spring.mapper;

import java.util.List;

import org.spring.entity.Chair;


public interface ChairMapper {
	List<Chair> queryAllChair();
	void updateChairById(Chair chair);

	void deleteChairById(int c_id);
	void insertChair(Chair chair);
}
