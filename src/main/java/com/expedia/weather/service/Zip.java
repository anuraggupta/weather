package com.expedia.weather.service;

import org.springframework.format.annotation.NumberFormat;

public class Zip {

	@NumberFormat(pattern = "#####")
	private String zip;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
