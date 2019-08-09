package org.spring.service.impl;

import java.util.List;

import org.spring.entity.Chair;
import org.spring.mapper.ChairMapper;
import org.springservice.ChairService;

public class ChairServiceImpl implements ChairService{
	
	private ChairMapper chairMapper;

	

	public ChairMapper getChairMapper() {
		return chairMapper;
	}

	public void setChairMapper(ChairMapper chairMapper) {
		this.chairMapper = chairMapper;
	}

	@Override
	public List<Chair> queryAllChair() {
		
		return chairMapper.queryAllChair();
	}

	@Override
	public void updateChairById(Chair Chair) {
		chairMapper.updateChairById(Chair);
		
	}
	
	
	
	@Override
	public void deleteChairById(int m_id) {
		chairMapper.deleteChairById(m_id);
		
	}

	@Override
	public void insertChair(Chair Chair) {
		
		System.out.println(Chair);
		chairMapper.insertChair(Chair);
		
		
	}
	
	
	

	
	
}
