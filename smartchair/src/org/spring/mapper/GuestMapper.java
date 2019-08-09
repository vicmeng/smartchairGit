package org.spring.mapper;

import java.util.List;


import org.spring.entity.Guest;


public interface GuestMapper {
	List<Guest> queryAllGuest();
	Guest queryGuestById();
	Guest insertGuestById(Guest guest);
	boolean deleteGuestById(int g_id);
	boolean updateGuestById(Guest guest);
}
