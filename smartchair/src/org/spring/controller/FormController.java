package org.spring.controller;

import java.util.List;

import org.spring.entity.Form;
import org.spring.entity.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springservice.FormService;

@RequestMapping("formController")
@Controller
public class FormController {
	@Autowired
	private FormService formService;

	public FormService getFormService() {
		return formService;
	}

	public void setFormService(FormService formService) {
		this.formService = formService;
	}
	
	@ResponseBody
	@RequestMapping(value="queryAllFormById/{g_id}")
	public Form queryAllFormById(@PathVariable("g_id") Integer g_id) {
		return formService.queryAllFormById(g_id);
		
	}
	@ResponseBody
	@RequestMapping(value="queryAllForm")
	public List<Form> queryAllForm() {
		return formService.queryAllForm();
		
	}
	@ResponseBody
	@RequestMapping(value="insertFormById")
	public boolean insertFormById(Time time) {
	
		formService.insertFormById(time);
		return true;
		
	}
	@ResponseBody
	@RequestMapping(value="updateFormById")
	public boolean updateFormById(Time time) {
	
		formService.updateFormById(time);
		return true;
		
	}
}
