package org.spring.controller;

import java.util.List;

import org.spring.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springservice.RestaurantService;


@RequestMapping("restaurantController")
@Controller
public class RestaurantController {
	//控制器依赖于service
	@Autowired
	//@Qualifier("personService")
		private RestaurantService restaurantService;

		public void setRestaurantService(RestaurantService restaurantService) {
			this.restaurantService = restaurantService;
		}
		
		
		@ResponseBody
		@RequestMapping(value="queryAllRestaurant")
		public List<Restaurant> queryAllRestaurant() {
			List<Restaurant> restaurants=restaurantService.queryAllRestaurant();
			System.out.println(restaurants);
			return restaurants;
		}
		@ResponseBody
		@RequestMapping(value="queryRestaurantById")
		public Restaurant queryRestaurantById() {
			Restaurant restaurant=restaurantService.queryRestaurantById();
			System.out.println(restaurant);
			return restaurant;
		}
		
		@ResponseBody
		@RequestMapping(value="deleteRestaurantById/{r_id}")
		public boolean deleteRestaurantById(@PathVariable("r_id") Integer r_id) {
			restaurantService.deleteRestaurantById(r_id);
			return true;
			
		}
		
		@ResponseBody
		@RequestMapping(value="updateRestaurantById")
		public boolean updateRestaurantById(Restaurant restaurant) {
			restaurantService.updateRestaurantById(restaurant);
			return true;
			
		}
		
		@ResponseBody
		@RequestMapping(value="insertRestaurant")
		public boolean insertRestaurant(Restaurant restaurant) {
			restaurantService.insertRestaurant(restaurant);
			return true;
			
		}
		
		
}
