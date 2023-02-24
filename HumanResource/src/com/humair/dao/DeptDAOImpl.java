package com.humair.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.humair.dto.Department;
import com.humair.exception.DepartmentException;

public class DeptDAOImpl implements DeptDAO {

	@Override
	public String addDeptToDB(Department d) throws DepartmentException {
		String message = "Adding";
		PreparedStatement ps = null;
		try (Connection conn = DbUtils.provideConnection()){
			if(d.getdHeadId() == 0) {

				 ps = conn.prepareStatement("insert into department values (?,?, NULL)");
				 
				ps.setInt(1, d.getDid());
				ps.setString(2, d.getdName());
		
	  		}
			else {
				 ps = conn.prepareStatement("insert into department values (?,?,?)");
				 
				ps.setInt(1, d.getDid());
				ps.setString(2, d.getdName());
				ps.setInt(3, d.getdHeadId());
			}
			
			int rowsEffected = ps.executeUpdate();
			
			if(rowsEffected > 0) {
				message = "Department Added Successfully"; 
			}
			else {
				throw new DepartmentException("Department Head must be an employee");
			}
			
			
		} catch (SQLException e) {
//			e.printStackTrace();
			throw new DepartmentException("Department Head must be an employee");
		}
		
		
		
		return message;
	}

	@Override
	public Department getDeptFromDB(int deptId) throws DepartmentException {
		
		Department dept = null;
		
		try (Connection conn = DbUtils.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from department where did = ?");
			ps.setInt(1, deptId);
			
				ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				dept = new Department(deptId, rs.getString("dname"), rs.getInt("d_Head_Id"));
			}
			else {
				throw new DepartmentException("No Department found with ID = " + deptId);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return dept;
	}
	
	private List<Department> getlistFormResultSet(ResultSet rs) throws SQLException{
		List<Department> list  = new ArrayList<Department>();
		
		while(rs.next()) {
			list.add(new Department(rs.getInt("did"), rs.getString("dname"), rs.getInt("d_Head_Id")));
			
		}
		return list;
		
	}
	
	@Override
	public List<Department> getAllDept() throws DepartmentException {
		List<Department> deptList = new ArrayList<Department>();
		
		try(Connection conn= DbUtils.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("select * from department");

			ResultSet rs= ps.executeQuery();
			
			deptList = getlistFormResultSet(rs);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DepartmentException(e.getMessage());
		}
		
		return deptList;
	}

	@Override
	public String updateDeptName(String newDeptName, int deptId) throws DepartmentException {
		String message = "Department Name NOT Updated";
		
		
		try (Connection conn = DbUtils.provideConnection()){
			PreparedStatement ps = conn.prepareStatement("Update department set dname = ? where did = ?");
			ps.setString(1, newDeptName);
			ps.setInt(2, deptId);
			
			int result = ps.executeUpdate();
			
			if(result < 1) {
				throw new DepartmentException("Wrong Department ID selected Or New Department Name too long.");
				
			}
			else {
				message = "Department Name is Successfully Updated !!";
			}
		} catch (SQLException e) {
			throw new DepartmentException(e.getMessage());
		}
		
		
		return message;
	}

	
}
