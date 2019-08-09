package org.spring.service.impl;

import java.util.List;

import org.spring.entity.Restaurant;
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

	@Override
	public List<Restaurant> queryAllRestaurant() {
		
		return restaurantMapper.queryAllRestaurant();
	}

	@Override
	public Restaurant queryRestaurantById() {
		
		return restaurantMapper.queryRestaurantById();
	}

	@Override
	public void deleteRestaurantById(int r_id) {
		restaurantMapper.deleteRestaurantById(r_id);
		
	}

	@Override
	public void updateRestaurantById(Restaurant restaurant) {
		restaurantMapper.updateRestaurantById(restaurant);
		
	}

	@Override
	public void insertRestaurant(Restaurant restaurant) {
		restaurantMapper.insertRestaurant(restaurant);
		
	}
	
	

	
	
}
