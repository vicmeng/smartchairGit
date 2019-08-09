package org.springservice;

import java.util.List;

import org.spring.entity.Restaurant;

public interface RestaurantService {
	List<Restaurant> queryAllRestaurant();
	Restaurant queryRestaurantById();
	void deleteRestaurantById(int r_id);
	void updateRestaurantById(Restaurant restaurant);
	void insertRestaurant(Restaurant restaurant);
}
