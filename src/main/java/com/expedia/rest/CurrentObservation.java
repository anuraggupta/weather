package com.expedia.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentObservation {
	
	private WeatherImage image;
	@JsonProperty("display_location")
	private DisplayLocation displayLocation;
	@JsonProperty("observation_location")
	private ObservationLocation observationLocation;

	@JsonProperty("temperature_string")
	private String tempString;
	@JsonProperty("temp_f")
	private String tempF;
	@JsonProperty("temp_c")
	private String tempC;

	public WeatherImage getImage() {
		return image;
	}

	public void setImage(WeatherImage image) {
		this.image = image;
	}

	public DisplayLocation getDisplayLocation() {
		return displayLocation;
	}

	public void setDisplayLocation(DisplayLocation displayLocation) {
		this.displayLocation = displayLocation;
	}

	public ObservationLocation getObservationLocation() {
		return observationLocation;
	}

	public void setObservationLocation(ObservationLocation observationLocation) {
		this.observationLocation = observationLocation;
	}
	public String getTempString() {
		return tempString;
	}

	public void setTempString(String tempString) {
		this.tempString = tempString;
	}

	public String getTempF() {
		return tempF;
	}

	public void setTempF(String tempF) {
		this.tempF = tempF;
	}

	public String getTempC() {
		return tempC;
	}

	public void setTempC(String tempC) {
		this.tempC = tempC;
	}

}
