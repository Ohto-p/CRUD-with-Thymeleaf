package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="locations")
public class Location {
	@Id
	@Column(name="location_id")
	Integer locationid;
	
	@Column(name="street_address")
	String streetaddress;
	
	@Column(name="postal_code")
	String postalcode;
	
	@Column(name="city")
	String city;
	
	@Column(name="state_province")
	String stateprovince;
	
	@Column(name="country_id")
	String countryid;

	//Getters and Setters
	public Integer getLocationid() {
		return locationid;
	}

	public void setLocationid(Integer locationid) {
		this.locationid = locationid;
	}

	public String getStreetaddress() {
		return streetaddress;
	}

	public void setStreetaddress(String streetaddress) {
		this.streetaddress = streetaddress;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateprovince() {
		return stateprovince;
	}

	public void setStateprovince(String stateprovince) {
		this.stateprovince = stateprovince;
	}

	public String getCountryid() {
		return countryid;
	}

	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}
	
	//Constructor Vacio
	public Location() {}

	//Constructor con campos
	public Location(Integer locationid, String streetaddress, String postalcode, String city, String stateprovince,
			String countryid) {
		super();
		this.locationid = locationid;
		this.streetaddress = streetaddress;
		this.postalcode = postalcode;
		this.city = city;
		this.stateprovince = stateprovince;
		this.countryid = countryid;
	}

	//To String 
	@Override
	public String toString() {
		return "Location [locationid=" + locationid + ", streetaddress=" + streetaddress + ", postalcode=" + postalcode
				+ ", city=" + city + ", stateprovince=" + stateprovince + ", countryid=" + countryid + "]";
	}
	
	
	
	
	
	
}
