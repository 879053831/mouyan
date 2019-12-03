package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mode.po.*;
import com.serviceDao.PowerServiceDao;


/**
 *系统 管理员工作站接收前端用Ajax发送的权限更改请求，
 *处理后相应的向前端页面发送处理结果
 * 
 * @author 94655
 *
 */
@Controller
@RequestMapping("/power")
public class GivePowerController {

	@Autowired
	private PowerServiceDao powerService;

	@RequestMapping("/givepower")
	@ResponseBody
	public Boolean givePower(Integer charetId, Integer powerId) {

		// Sevice业务操作
		Boolean flag = false;// powerService.givePower(charetId, powerId);


		return flag;
	}

	
	@RequestMapping("/userBanOrStart")
	@ResponseBody
	public Boolean userBanOrStart(Integer empId) {
		
		Boolean emp = null;
		
		emp = powerService.userBanOrStart(empId);
		
		return emp;
	}
	
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public Boolean updateUser(TBEmploy tbemp) {
		
		Boolean emp = null;
		
		emp = powerService.updateUser(tbemp);
		
		return emp;
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public Boolean deleteUser(Integer tbemp) {
		
		Boolean flag = null;
		
		flag = powerService.deleteUser(tbemp);
		
		return flag;
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public Boolean addUser(TBEmploy tbemp) {
		
		Boolean flag = null;
		
		flag = powerService.addUser(tbemp);
		
		return flag;
	}
	
	@RequestMapping("/addCharet")
	@ResponseBody
	public Boolean addCharet(TBCharet charet) {
		
		Boolean flag = null;
		
		flag = powerService.addCharet(charet);
		
		return flag;
	}
	
	@RequestMapping("/updateCharet")
	@ResponseBody
	public Boolean updateCharet(TBCharet charet) {
		
		Boolean flag = null;
		
		flag = powerService.updateCharet(charet);
		
		return flag;
	}
	
	@RequestMapping("/deleteCharet")
	@ResponseBody
	public Boolean deleteCharet(Integer charetId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteCharet(charetId);
		
		return flag;
	}
	

	@RequestMapping("/addMainMeal")
	@ResponseBody
	public Boolean addMainMeal(TBMainMeal mainMeal) {
		
		Boolean flag = null;
		
		flag = powerService.addMainMeal(mainMeal);
		
		return flag;
	}
	
	@RequestMapping("/updateMainMeal")
	@ResponseBody
	public Boolean updateCharet(TBMainMeal mainMeal) {
		
		Boolean flag = null;
		
		flag = powerService.updateMainMeal(mainMeal);
		
		return flag;
	}
	
	@RequestMapping("/deleteMainMeal")
	@ResponseBody
	public Boolean deleteMainMeal(Integer charetId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteMainMeal(charetId);
		
		return flag;
	}
	
	@RequestMapping("/addUnit")
	@ResponseBody
	public Boolean addUnit(TBWorkUnit unit) {
		
		Boolean flag = null;
		
		flag = powerService.addUnit(unit);
		
		return flag;
	}
	
	@RequestMapping("/updateUnit")
	@ResponseBody
	public Boolean updateUnit(TBWorkUnit unit) {
		
		Boolean flag = null;
		
		flag = powerService.updateUnit(unit);
		
		return flag;
	}
	
	@RequestMapping("/deleteUnit")
	@ResponseBody
	public Boolean deleteUnit(Integer unitId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteUnit(unitId);
		
		return flag;
	}
	
	
	

	@RequestMapping("/addMinor")
	@ResponseBody
	public Boolean addMinor(TBMinor minor) {
		
		Boolean flag = null;
		
		flag = powerService.addMinor(minor);
		
		return flag;
	}
	
	@RequestMapping("/updateMinor")
	@ResponseBody
	public Boolean updateMinor(TBMinor minor) {
		
		Boolean flag = null;
		
		flag = powerService.updateMinor(minor);
		
		return flag;
	}
	
	@RequestMapping("/deleteMinor")
	@ResponseBody
	public Boolean deleteMinor(Integer minorId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteMinor(minorId);
		
		return flag;
	}
	
	
	

	@RequestMapping("/addProject")
	@ResponseBody
	public Boolean addProject(TBProject project) {
		
		Boolean flag = null;
		
		flag = powerService.addProject(project);
		
		return flag;
	}
	
	@RequestMapping("/updateProject")
	@ResponseBody
	public Boolean updateProject(TBProject project) {
		
		Boolean flag = null;
		
		flag = powerService.updateProject(project);
		
		return flag;
	}
	
	@RequestMapping("/deleteProject")
	@ResponseBody
	public Boolean deleteProject(Integer projectId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteProject(projectId);
		
		return flag;
	}
	
	

	@RequestMapping("/addMeal")
	@ResponseBody
	public Boolean addMeal(TBMeal meal) {
		
		Boolean flag = null;
		
		flag = powerService.addMeal(meal);
		
		return flag;
	}
	
	@RequestMapping("/updateMeal")
	@ResponseBody
	public Boolean updateMeal(TBMeal meal) {
		
		Boolean flag = null;
		
		flag = powerService.updateMeal(meal);
		
		return flag;
	}
	
	@RequestMapping("/deleteMeal")
	@ResponseBody
	public Boolean deleteMeal(Integer mealId) {
		
		Boolean flag = null;
		
		flag = powerService.deleteMeal(mealId);
		
		return flag;
	}
	
	
}
