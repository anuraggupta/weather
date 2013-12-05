package com.expedia.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherConditionsResponse {

	private WundergroundResponse response;
	
	@JsonProperty("current_observation")
	private CurrentObservation currentObservation;

	public WundergroundResponse getResponse() {
		return response;
	}

	public void setResponse(WundergroundResponse response) {
		this.response = response;
	}

	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
}
