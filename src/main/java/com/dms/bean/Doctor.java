package com.dms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_doctor")
public class Doctor {
	@Id
	@Column(name="dId")
	private int dId;
	@Column(name="dName")
	private String dName;
	@Column(name="dDept")
	private String dDept;
	@Column(name="dSalary")
	private int dSalary;
	public Doctor() {
		super();
	
	}
	public Doctor(int dId, String dName, String dDept, int dSalary) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dDept = dDept;
		this.dSalary = dSalary;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdDept() {
		return dDept;
	}
	public void setdDept(String dDept) {
		this.dDept = dDept;
	}
	public int getdSalary() {
		return dSalary;
	}
	public void setdSalary(int dSalary) {
		this.dSalary = dSalary;
	}
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", dName=" + dName + ", dDept=" + dDept + ", dSalary=" + dSalary + "]";
	}
	
	
	
	
	
	

}
