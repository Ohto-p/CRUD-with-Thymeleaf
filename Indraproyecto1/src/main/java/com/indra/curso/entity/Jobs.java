package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs {
	
	@Id
	@Column(name="job_id")
	String jobid;
	
	@Column(name="job_title")
	String jobtitle;
	
	@Column(name="min_salary")
	Integer minsalary;
	
	@Column(name="max_salary")
	Integer maxsalary;
	
	//Getters and Setters
	public String getJobid() {
		return jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Integer getMinsalary() {
		return minsalary;
	}

	public void setMinsalary(Integer minsalary) {
		this.minsalary = minsalary;
	}

	public Integer getMaxsalary() {
		return maxsalary;
	}

	public void setMaxsalary(Integer maxsalary) {
		this.maxsalary = maxsalary;
	}
	
	//Constructor vacio
	public Jobs() {}
	
	//construrtor con todos los campos 
	public Jobs(String jobid, String jobtitle, Integer minsalary, Integer maxsalary) {
		super();
		this.jobid = jobid;
		this.jobtitle = jobtitle;
		this.minsalary = minsalary;
		this.maxsalary = maxsalary;
	
	
	}

	//Tostring
	@Override
	public String toString() {
		return "Jobs [jobid=" + jobid + ", jobtitle=" + jobtitle + ", minsalary=" + minsalary + ", maxsalary="
				+ maxsalary + "]";
	}

	
	
	
	

}
