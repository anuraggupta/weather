package com.expedia.rest;

import com.expedia.weather.service.pojo.WeatherConditions;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UISuccessResponse implements UIResponse {

	private String city;
	private String state;
	private String tempF;

	public UISuccessResponse(WeatherConditions conditionsByZip) {
		if (null != conditionsByZip.getCurrentObservation()) {

			this.city = conditionsByZip.getCurrentObservation()
					.getDisplayLocation().getCity();
			this.state = conditionsByZip.getCurrentObservation()
					.getDisplayLocation().getState();
			this.tempF = conditionsByZip.getCurrentObservation().getTempF();
		}

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

	public String getTempF() {
		return tempF;
	}

	public void setTempF(String tempF) {
		this.tempF = tempF;
	}

}
