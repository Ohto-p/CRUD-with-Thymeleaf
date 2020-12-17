package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {
	
	@Id
	@Column(name="region_id")
	private Integer regionid;
	
	@Column(name="region_name")
	private String regionname;
	
	//Getters and Setters
	public Integer getRegionid() {
		return regionid;
	}

	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	//Constructor vacio
	public Region() {}
	
	//Constructor con campos
	public Region(Integer regionid, String regionname) {
		super();
		this.regionid = regionid;
		this.regionname = regionname;
	}
	
	//to string
	@Override
	public String toString() {
		return "Region [regionid=" + regionid + ", regionname=" + regionname + "]";
	}
	
	
	
	
}
