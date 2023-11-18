package com.example.unitTestingTutorials.model;

public class EmployeeJson {
	
	private Long eid;
	private String Ename;
	private String Eaddress;
	
	EmployeeJson(){}

	public EmployeeJson(Long eid, String ename, String eaddress) {
		super();
		this.eid = eid;
		Ename = ename;
		Eaddress = eaddress;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getEaddress() {
		return Eaddress;
	}

	public void setEaddress(String eaddress) {
		Eaddress = eaddress;
	}
	
	
	

}
