package com.humair.dto;

public class EmployeeLeaveImp implements EmployeeLeave{
	private int emp_id;
	private String emp_name;
	private String leave_day;
	private String status;
	public EmployeeLeaveImp(int emp_id, String emp_name, String leave_day, String status) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.leave_day = leave_day;
		this.status = status;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getLeave_day() {
		return leave_day;
	}
	public void setLeave_day(String leave_day) {
		this.leave_day = leave_day;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Leave Details [emp_id=" + emp_id + ", emp_name=" + emp_name + ", leave_day=" + leave_day + ", status="
				+ status + "]";
	}
	
	



}
