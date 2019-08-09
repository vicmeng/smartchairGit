package org.spring.service.impl;

import java.util.List;

import org.spring.entity.Chair;
import org.spring.entity.Count;
import org.spring.entity.Guest;
import org.spring.mapper.ChairMapper;
import org.spring.mapper.GuestMapper;
import org.springservice.ChairService;
import org.springservice.GuestService;

public class GuestServiceImpl implements GuestService{

	
	private GuestMapper guestMapper;
	
	
	
	
	public GuestMapper getGuestMapper() {
		return guestMapper;
	}

	public void setGuestMapper(GuestMapper guestMapper) {
		this.guestMapper = guestMapper;
	}

	@Override
	public List<Guest> queryAllGuest() {
		
		return guestMapper.queryAllGuest();
	}

	@Override
	public Guest queryGuestById() {
		
		return guestMapper.queryGuestById();
	}

	@Override
	public Guest insertGuestById(Guest guest) {
	
		return guestMapper.insertGuestById(guest);
	}

	@Override
	public boolean deleteGuestById(int g_id) {
		guestMapper.deleteGuestById(g_id);
		return true;
	}

	@Override
	public boolean updateGuestById(Guest guest) {
		guestMapper.updateGuestById(guest);
		return true;
	}
	
	
	
	
	

	
	
}
