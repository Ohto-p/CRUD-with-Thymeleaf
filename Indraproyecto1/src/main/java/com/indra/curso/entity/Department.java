package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
		
	@OneToOne
	@JoinColumn(name="location_id")
	private Location location;
		
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
		
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	//Constructor vacio
	public Department() {}

	//Constructor de inicializacion
	public Department(Integer departmentid, String departmentname, Integer managerid, Location location) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.managerid = managerid;
		this.location = location;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + ", managerid="
				+ managerid + ", location=" + location + "]";
	}
	
	
}
