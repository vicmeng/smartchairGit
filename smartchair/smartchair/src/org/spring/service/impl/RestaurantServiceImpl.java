package org.spring.service.impl;

import org.spring.mapper.RestaurantMapper;
import org.springservice.RestaurantService;

public class RestaurantServiceImpl implements RestaurantService{
	
	private RestaurantMapper restaurantMapper;

	public RestaurantMapper getRestaurantMapper() {
		return restaurantMapper;
	}

	public void setRestaurantMapper(RestaurantMapper restaurantMapper) {
		this.restaurantMapper = restaurantMapper;
	}
	
	

	
	
}
