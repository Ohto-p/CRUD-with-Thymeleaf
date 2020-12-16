package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
	@Id
	@Column(name="department_id")
	private Integer departmentid;
	
	@Column(name="department_name")
	private String departmentname;
		
	@Column(name="manager_id")
	private Integer managerid;
		
	@Column(name="location_id")
	private Integer locationid;
		
	//Getter and Setters
	public Integer getDepartmentid() {
		return departmentid;
	}
		
	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}
		
	public String getDepartmentname() {
		return departmentname;
	}
		
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
		
	public Integer getManagerid() {
		return managerid;
	}
		
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}
		
	public Integer getLocationid() {
		return locationid;
	}
		
	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}
		
	//Constructor vacio
	public Department() {}
	
	//Constructor de inicializacion
	public Department(Integer departmentid, String departmentname, Integer managerid, Integer locationid) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.managerid = managerid;
		this.locationid = locationid;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + ", managerid="
				+ managerid + ", locationid=" + locationid + "]";
	}
	
	
	
}
