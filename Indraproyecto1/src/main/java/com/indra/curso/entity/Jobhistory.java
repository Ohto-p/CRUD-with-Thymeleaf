package com.indra.curso.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_history")
public class Jobhistory {
	
	@Column(name="employee_id")
	Integer employeeid;
	
	@Id
	@Column(name="start_date")
	Date startdate;
	
	@Column(name="end_date")
	Date enddate;
	
	@Column(name="jobid")
	String jobid;
	
	@Column(name="department_id")
	Integer departmentid;

	//Getter and Setter
	public Integer getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getJobid() {
		return jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
	
	//Constructor vacio
	public Jobhistory() {}
	
	//Constructor con campos
	public Jobhistory(Integer employeeid, Date startdate, Date enddate, String jobid, Integer departmentid) {
		super();
		this.employeeid = employeeid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.jobid = jobid;
		this.departmentid = departmentid;
	}

	//To String
	@Override
	public String toString() {
		return "Jobhistory [employeeid=" + employeeid + ", startdate=" + startdate + ", enddate=" + enddate + ", jobid="
				+ jobid + ", departmentid=" + departmentid + "]";
	}
	
}
