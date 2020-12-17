package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JOB_HISTORY")
public class Jobhistory {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Integer employeeid;
	
	@Column(name="START_DATE")
	private String startdate;
	
	@Column(name="END_DATE")
	private String enddate;
	
	@OneToOne
	@JoinColumn(name="JOB_ID")
	private Jobs job;
	
	@OneToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Department department;

	//Getter and Setter

	public Integer getEmployeeid() {
		return employeeid;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	//Constructor vacio
	public Jobhistory() {}
	
	//Constructor con campos
	public Jobhistory(Integer employeeid, String startdate, String enddate, Jobs job, Department department) {
		super();
		this.employeeid = employeeid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.job = job;
		this.department = department;
	}
	
	//To String
	@Override
	public String toString() {
		return "Jobhistory [employeeid=" + employeeid + ", startdate=" + startdate + ", enddate=" + enddate + ", job="
				+ job + ", department=" + department + "]";
	}
}
