package com.expedia.rest;

public class Weather {

	Integer zipCode;
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}
	public Weather(Integer zipCode){
		this.zipCode = zipCode;
	}
	
	
	
}
