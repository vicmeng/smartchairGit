package org.springservice;

import java.util.List;

import org.spring.entity.Form;
import org.spring.entity.Time;

public interface FormService {
	Form queryAllFormById(int g_id);
	List<Form> queryAllForm();
	boolean insertFormById(Time time);
	boolean updateFormById(Time time);
}
