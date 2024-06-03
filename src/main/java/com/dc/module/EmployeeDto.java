package com.dc.module;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class EmployeeDto {
	private Integer eid;
	@NotNull
	private String ename;
	@Positive
	@Min(99999)
	@Max(999999)
	private Integer salary;

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public EmployeeDto(Integer eid, String ename, Integer salary) {
		super();
		
		this.ename = ename;
		this.salary = salary;
		this.eid=eid;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}
