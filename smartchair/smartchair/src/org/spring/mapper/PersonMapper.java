package org.spring.mapper;

import java.util.List;

import org.spring.entity.Person;


public interface PersonMapper {
	//方法名和mapper.xml文件 中标签名的id值一样
   Person	queryPersonById(int id);
   	int	insertPerson(Person person);
   	void	deletePersonById(int id);
   	int	updatePersonById(Person person);
   List<Person>   queryAllPersonById();
}
