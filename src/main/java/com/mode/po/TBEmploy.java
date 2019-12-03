package com.mode.po;

/**
 * 数据库员工信息对象
 * @author yaoman
 *
 */
public class TBEmploy extends TBWorkUnit {

	// 员工ID
	private Integer empId;
	// 员工账号
	private String empUsername;
	// 员工密码
	private String mepPassword;
	// 员工职称
	private String empJob;
	// 员工账号状态
	private Boolean empState;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpUsername() {
		return empUsername;
	}

	public void setEmpUsername(String empUsername) {
		this.empUsername = empUsername;
	}

	public String getMepPassword() {
		return mepPassword;
	}

	public void setMepPassword(String mepPassword) {
		this.mepPassword = mepPassword;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public Boolean getEmpState() {
		return empState;
	}

	public void setEmpState(Boolean empState) {
		this.empState = empState;
	}

	@Override
	public String toString() {
		return "TBEmploy [empId=" + empId + ", empUsername=" + empUsername + ", mepPassword=" + mepPassword
				+ ", empJob=" + empJob + ", empState=" + empState + "]";
	}

	
}
