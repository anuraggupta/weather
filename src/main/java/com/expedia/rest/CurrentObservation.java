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

	private Estimated estimated;

	@JsonProperty("station_id")
	private String stationId;
	@JsonProperty("observation_time")
	private String observationTime;
	private String weather;
	@JsonProperty("temperature_string")
	private String tempString;
	@JsonProperty("temp_f")
	private String tempF;
	@JsonProperty("temp_c")
	private String tempC;
	@JsonProperty("feelslike_string")
	private String feelsLikeString;
	@JsonProperty("feelslike_f")
	private String feelsLikeF;
	@JsonProperty("feelslike_c")
	private String feelsLikeC;
	@JsonProperty("UV")
	private String uV;
	private String icon;
	@JsonProperty("icon_url")
	private String iconUrl;

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

	public Estimated getEstimated() {
		return estimated;
	}

	public void setEstimated(Estimated estimated) {
		this.estimated = estimated;
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getObservationTime() {
		return observationTime;
	}

	public void setObservationTime(String observationTime) {
		this.observationTime = observationTime;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
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

	public String getFeelsLikeString() {
		return feelsLikeString;
	}

	public void setFeelsLikeString(String feelsLikeString) {
		this.feelsLikeString = feelsLikeString;
	}

	public String getFeelsLikeF() {
		return feelsLikeF;
	}

	public void setFeelsLikeF(String feelsLikeF) {
		this.feelsLikeF = feelsLikeF;
	}

	public String getFeelsLikeC() {
		return feelsLikeC;
	}

	public void setFeelsLikeC(String feelsLikeC) {
		this.feelsLikeC = feelsLikeC;
	}

	public String getuV() {
		return uV;
	}

	public void setuV(String uV) {
		this.uV = uV;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

}
