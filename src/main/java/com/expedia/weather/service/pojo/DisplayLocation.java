package com.expedia.weather.service.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayLocation extends ObservationLocation {

	private String zip;
	private String magic;
	private String wmo;
	@JsonProperty("state_name")
	private String stateName;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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
