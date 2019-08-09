package org.springservice;

import java.util.List;

import org.spring.entity.Chair;
import org.spring.entity.Count;
import org.spring.entity.Guest;


public interface GuestService {
	List<Guest> queryAllGuest();
	Guest queryGuestById();
	Guest insertGuestById(Guest guest);
	boolean deleteGuestById(int g_id);
	boolean updateGuestById(Guest guest);
}
