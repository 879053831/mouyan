package com.mode.po;

/**
 * 数据库角色权限信息对象
 * @author 94655
 *
 */
public class TBPower {

	//权限ID
	private Integer powerId;
	//菜单ID
	private Integer mainMmealId;
	//角色ID
	private Integer charetId;
	public Integer getPowerId() {
		return powerId;
	}
	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}
	public Integer getMainMmealId() {
		return mainMmealId;
	}
	public void setMainMmealId(Integer mainMmealId) {
		this.mainMmealId = mainMmealId;
	}
	public Integer getCharetId() {
		return charetId;
	}
	public void setCharetId(Integer charetId) {
		this.charetId = charetId;
	}
	
	
}
