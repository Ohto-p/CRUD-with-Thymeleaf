package com.indra.curso.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name ="COUNTRIES")
public class Country {
	@Id
	@Column(name="country_id")
	private String countryid;
	
	@NonNull
	@Column(name="country_name")
	private String countryname;
	
	@OneToOne
	@JoinColumn(name="region_id")
	private Region region;
	
	//Getters and Setter
	public String getCountryid() {
		return countryid;
	}

	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	//Constructor vacio
	public Country () {}
	
	//Constructor con campos 
	public Country(String countryid, String countryname, Region region) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.region = region;
	}
	
	//To string
	@Override
	public String toString() {
		return "Country [countryid=" + countryid + ", countryname=" + countryname + ", region=" + region + "]";
	}
}
