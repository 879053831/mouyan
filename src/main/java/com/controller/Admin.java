package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mode.dto.TestForm;
import com.mode.po.*;
import com.serviceDao.PowerServiceDao;


/**
 * 系统管理员工作站页面请求管理员页面及相关数据请求，不包含对数据库的数据处理
 * @author 94655
 *
 */
@Controller
@RequestMapping("/admin")
public class Admin {


	@Autowired
	private PowerServiceDao powerService;
	
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
	@ResponseBody
	public TBEmploy getShowFormPage(TBEmploy formMassage) {
		
		if(formMassage == null)
			System.out.println("NULL");
		else
		{
			System.out.println(formMassage);
			
		}
		return formMassage;
	}
	
	@RequestMapping("getAllEmploy")
	@ResponseBody
	public List<TBEmploy> findAllEmploy(){
		List<TBEmploy> list = new ArrayList<TBEmploy>();
		list = powerService.findAllEmploy();
		return list;
	}
	
	@RequestMapping("getAllUnit")
	@ResponseBody
	public List<TBWorkUnit> findAllUnit(){
		List<TBWorkUnit> list = new ArrayList<TBWorkUnit>();
		list = powerService.findAllUnit();
		return list;
	}
	

	@RequestMapping("getAllMainMeal")
	@ResponseBody
	public List<TBMainMeal> findAllMainMeal(){
		List<TBMainMeal> list = new ArrayList<TBMainMeal>();
		list = powerService.findAllMainMeal();
		return list;
	}
	
	@RequestMapping("getAllCharet")
	@ResponseBody
	public List<TBCharet> findAllCharet(){
		List<TBCharet> list = new ArrayList<TBCharet>();
		list = powerService.findAllCharet();
		return list;
	}
	

	@RequestMapping("getAllMinor")
	@ResponseBody
	public List<TBMinor> findAllMinor(){
		List<TBMinor> list = new ArrayList<TBMinor>();
		list = powerService.findAllMinor();
		return list;
	}
	
	@RequestMapping("getAllProject")
	@ResponseBody
	public List<TBProject> findAllProject(){
		List<TBProject> list = new ArrayList<TBProject>();
		list = powerService.findAllProject();
		return list;
	}
	

	@RequestMapping("getAllMeal")
	@ResponseBody
	public List<TBMeal> findAllMeal(){
		List<TBMeal> list = new ArrayList<TBMeal>();
		list = powerService.findAllMeal();
		return list;
	}


	@RequestMapping("/findAllPower")
	@ResponseBody
	public Map<Integer,TBPower> findAllPower() {
		
		TBPower power1 = new TBPower();
		power1.setPowerId(1);
		TBPower power2 = new TBPower();
		power2.setPowerId(2);
		TBPower power3 = new TBPower();
		power3.setPowerId(3);
		// Sevice业务操作
		//Map<Integer,TBPower> map = powerService.findAllPower();
		Map<Integer,TBPower> map = new HashMap<Integer, TBPower>();
		
		map.put(1, power1);
		map.put(2, power2);
		map.put(3, power3);

		return map;
	}
	
}
