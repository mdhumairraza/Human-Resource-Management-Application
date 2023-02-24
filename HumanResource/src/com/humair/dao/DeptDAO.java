package com.humair.dao;

import java.util.List;

import com.humair.dto.Department;
import com.humair.exception.DepartmentException;

public interface DeptDAO {
	
	public String addDeptToDB(Department d)throws DepartmentException;
	
	public Department getDeptFromDB(int deptId) throws DepartmentException;
	
	public List<Department> getAllDept() throws DepartmentException;
	
	public String updateDeptName(String newDeptName, int deptId) throws DepartmentException;
	
	
}
