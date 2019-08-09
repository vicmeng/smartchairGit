package org.spring.mapper;

import java.util.List;

import org.spring.entity.User;

public interface UserMapper {
	User queryUserById(int id);
	int insertUser(User user);
	void deleteUserById(int id);
	int updateUserById(int id);
	List<User> queryAllUserById();
}
