package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mode.pojo.TestForm;

@Controller
@RequestMapping("/admin")
public class Admin {

	@RequestMapping("")
	public ModelAndView getAdminPage(TestForm formMassage) {
		
		ModelAndView model = new ModelAndView();
		model.addObject("formMag", formMassage);
		model.setViewName("admin");
		return model;
	}
	
	@RequestMapping("/test")
	public String getTestPage() {
		return "testform";
	}
	
	@RequestMapping("/showform")
	public ModelAndView getShowFormPage(TestForm formMassage) {
		
		ModelAndView model = new ModelAndView();
		model.addObject("formMag", formMassage);
		model.setViewName("showform");
		return model;
	}
}
