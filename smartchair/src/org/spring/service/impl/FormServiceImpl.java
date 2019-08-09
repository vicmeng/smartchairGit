package org.spring.service.impl;

import java.util.List;

import org.spring.entity.Form;
import org.spring.entity.Time;
import org.spring.mapper.FormMapper;
import org.springservice.FormService;

public class FormServiceImpl implements FormService {
	private FormMapper formMapper;

	public FormMapper getFormMapper() {
		return formMapper;
	}

	public void setFormMapper(FormMapper formMapper) {
		this.formMapper = formMapper;
	}

	@Override
	public Form queryAllFormById(int g_id) {
		// TODO Auto-generated method stub
		return formMapper.queryAllFormById(g_id);
	}

	@Override
	public List<Form> queryAllForm() {
		// TODO Auto-generated method stub
		return formMapper.queryAllForm();
	}

	@Override
	public boolean insertFormById(Time time) {
		formMapper.insertFormById(time);
		return true;
	}

	@Override
	public boolean updateFormById(Time time) {
		formMapper.updateFormById(time);
		return true;
	}
	
	
	
}
