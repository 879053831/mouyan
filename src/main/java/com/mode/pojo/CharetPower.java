package com.mode.pojo;

/**
 * 各个角色所对应的权限，项目启动时，该数据信息应从数据库中获取，保存在内存中， 增删改都应该先操作数据库，数据库修改成功后再修改内存中的数据
 * 
 * @author yaoman
 *
 */
public class CharetPower {

	// 角色ID
	private Integer charetId;
	// 权限ID
	private Integer powerId;
	// 角色名称
	private String charetName;
	// 权限名字
	private String powerName;
	//启用状态
	private Boolean charetState;

	public Integer getCharetId() {
		return charetId;
	}

	public void setCharetId(Integer charetId) {
		this.charetId = charetId;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	public String getCharetName() {
		return charetName;
	}

	public void setCharetName(String charetName) {
		this.charetName = charetName;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public Boolean getCharetState() {
		return charetState;
	}

	public void setCharetState(Boolean charetState) {
		this.charetState = charetState;
	}

}
