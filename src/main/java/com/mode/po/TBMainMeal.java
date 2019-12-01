package com.mode.po;



/**
 * 系统/数据库表菜单信息，该数据应先从数据库中获取，然后保存在内存中，
 * 增删改要注意先操作数据库成功后再修改内存
 * @author yaoman
 *
 */
public class TBMainMeal {

	//菜单ID
	private Integer MainMealId;
	//菜单名字
	private String MainMealName;
	public Integer getMainMealId() {
		return MainMealId;
	}
	public void setMainMealId(Integer mainMealId) {
		MainMealId = mainMealId;
	}
	public String getMainMealName() {
		return MainMealName;
	}
	public void setMainMealName(String mainMealName) {
		MainMealName = mainMealName;
	}
	
	
}
