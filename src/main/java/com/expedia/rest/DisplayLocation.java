package com.expedia.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayLocation {

	private String full;
	private String city;
	private String state;
	@JsonProperty("state_name")
	private String stateName;
	private String country; 
	@JsonProperty("country_iso3166")
	private String countryISO3166;
	private String zip;
	private String latitude;
	private String longitude;
	private String elevation;
	private String magic;
	private String wmo;
	public String getFull() {
		return full;
	}
	public void setFull(String full) {
		this.full = full;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryISO3166() {
		return countryISO3166;
	}
	public void setCountryISO3166(String countryISO3166) {
		this.countryISO3166 = countryISO3166;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getElevation() {
		return elevation;
	}
	public void setElevation(String elevation) {
		this.elevation = elevation;
	}
	public String getMagic() {
		return magic;
	}
	public void setMagic(String magic) {
		this.magic = magic;
	}
	public String getWmo() {
		return wmo;
	}
	public void setWmo(String wmo) {
		this.wmo = wmo;
	}
	
}
