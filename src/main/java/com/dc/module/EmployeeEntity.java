package com.dc.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "Employeee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	@NotNull(message = "username shouldn't be null")
	private String ename;
//	@NotBlank
//	@Pattern(regexp = "^\\d{6}$")
	@Positive
	
	private Integer salary;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(Integer eid, String ename, Integer salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
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
