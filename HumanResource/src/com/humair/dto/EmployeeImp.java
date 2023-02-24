package com.humair.dto;

public class EmployeeImp implements Employee{
	private String name;
	private String pass;
    private int emp_id;
    private int dept_id;
    private String dept_name;
   
	public EmployeeImp() {};

	public EmployeeImp(String name, String pass, int emp_id, int dept_id, String dept_name) {
		this.name = name;
		this.pass = pass;
		this.emp_id = emp_id;
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	
	@Override
	public String toString() {
		
		
		
					return "|------------------------------------|"+ '\n'+
						   "|Employee Name = "+ name +"                 "+ '\n'+
						   "|Employee Passwprd = "+ pass +"             "+ '\n'+
						   "|Employee ID = " + emp_id +"                "+ '\n'+
						   "|Department Id= "+ dept_id+"                "+ '\n'+
						   "|Department Name = " + dept_name+"            "+ '\n'+
						   "|------------------------------------|";
	}
 
    

}
