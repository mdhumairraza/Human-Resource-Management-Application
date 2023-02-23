package com.humair.dto;

public class Department {

	private int did;
	private String dName;
	private int dHeadId;

	public Department() {};	
	
	public Department(int did, String dName, int dHeadId) {
		this.did = did;
		this.dName = dName;
		this.dHeadId = dHeadId;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getdHeadId() {
		return dHeadId;
	}

	public void setdHeadId(int dHeadId) {
		this.dHeadId = dHeadId;
	};
	

	@Override
	public String toString() {
		return "[Department ID : " + did + " | Department Name : " + dName + "]";
	}
	
	
}
