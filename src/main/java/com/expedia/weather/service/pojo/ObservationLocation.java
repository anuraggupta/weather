package com.expedia.weather.service.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObservationLocation {


	private String full;
	private String city;
	private String state;
	private String country;
	@JsonProperty("country_iso3166")
	private String countryISO3;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountryISO3() {
		return countryISO3;
	}
	public void setCountryISO3(String countryISO3) {
		this.countryISO3 = countryISO3;
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
	private String latitude;
	private String longitude;
	private String elevation;
}
