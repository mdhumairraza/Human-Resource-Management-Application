package com.humair.dto;

public class Employee {
	private int eid;
	private String ename;
	private int deptId;
	private String email;
	private String password;
	private int salary;
	private String address;
	private int leavesLeft;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee( String ename, int deptId, String email, int salary, String address) {
		super();
		this.ename = ename;
		this.deptId = deptId;
		this.email = email;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(String ename, int deptId, String email, String password, int salary) {
		super();
		this.ename = ename;
		this.deptId = deptId;
		this.email = email;
		this.password = password;
		this.salary = salary;
	}

	public Employee(int eid, String ename, int deptId, String email, int salary, String address, int leaveLeft) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptId = deptId;
		this.email = email;
		this.salary = salary;
		this.address = address;
		this.leavesLeft = leaveLeft;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", deptId=" + deptId + ", email=" + email + ", password="
				+ password + ", salary=" + salary + ", address=" + address + "]";
	}

	public int getLeavesLeft() {
		return leavesLeft;
	}

	public void setLeavesLeft(int leavesLeft) {
		this.leavesLeft = leavesLeft;
	}
	
	
}
