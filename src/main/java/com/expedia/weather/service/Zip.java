package com.expedia.weather.service;

import javax.validation.constraints.Pattern;

public class Zip {

	@Pattern(regexp = "^/\\d{5}([-+]?/\\d{4})?$")
	private String zip;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
