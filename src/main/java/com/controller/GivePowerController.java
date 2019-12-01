package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.serviceDao.PowerServiceDao;

@Controller
@RequestMapping("power")
public class GivePowerController {
	
	//@Autowired
	private PowerServiceDao powerService;
	
	@RequestMapping("/givepower")
	public ModelAndView givePower(String charetId, String powerId) {
		
		System.out.println("load powerController");
		
		//Sevice业务操作
		Boolean flag = false;//powerService.givePower(charetId, powerId);
		
		//设置页面模型数据
		ModelAndView model = new ModelAndView();
		model.setViewName("givepower");//视图名字
		model.addObject("givePwerFlag", flag);//向视图发送数据
		
		return model;
	}
}
