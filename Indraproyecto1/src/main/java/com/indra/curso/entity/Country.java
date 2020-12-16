package com.indra.curso.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	@NonNull
	@Column(name="region_id")
	private String regionid;
	
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

	public String getRegionid() {
		return regionid;
	}

	public void setRegionid(String regionid) {
		this.regionid = regionid;
	}
	
	//Constructor vacio
	public Country () {}
	
	//Constructor con campos 
	public Country(String countryid, String countryname, String regionid) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.regionid = regionid;
	}

	//To string
	@Override
	public String toString() {
		return "Country [countryid=" + countryid + ", countryname=" + countryname + ", regionid=" + regionid + "]";
	}
	
}
