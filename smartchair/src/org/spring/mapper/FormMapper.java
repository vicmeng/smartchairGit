package org.spring.mapper;

import java.util.List;

import org.spring.entity.Form;
import org.spring.entity.Time;

public interface FormMapper {
	Form queryAllFormById(int g_id);
	List<Form> queryAllForm();
	boolean insertFormById(Time time);
	boolean updateFormById(Time time);
}
