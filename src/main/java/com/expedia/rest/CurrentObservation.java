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
	private String stationId;
	private String observationTime;
	private String observationTimeRFC822;
	private String observationEpoch;
	private String localTimeRFC822;
	private String localEpoch;
	private String localTZShort;
	private String localTZLong;
	private String localTZOffset;
	private String weather;
	private String tempString;
	private String tempF;
	private String tempC;
	private String relativeHumidity;
	private String windString;
	private String windGustKph;
	private String windDir;
	private String windDegrees;
	private String windMph;
	private String windGustMph;
	private String windKph;
	private String pressureMb;
	private String pressureIn;
	private String pressureTrend;
	private String dewpointString;
	private String dewpointF;
	private String dewPointC;
	private String heatIndexString;
	private String heatIndexF;
	private String heatIndexC;
	private String windChillString;
	private String windChillF;
	private String windChillC;
	private String feelsLikeString;
	private String feelsLikeF;
	private String feelsLikeC;
	private String visibilityMi;
	private String visibilityKm;
	private String solarRadiation;
	private String uV;
	private String precip1HrString;
	private String precip1HrIn;
	private String precip1HrMetric;
	private String precipTodayString;
	private String precipTodayIn;
	private String precipTodayMetric;
	private String icon;
	private String iconUrl;
	private String forecastUrl;
	private String historyUrl;
	private String obUrl;
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
	public String getObservationTimeRFC822() {
		return observationTimeRFC822;
	}
	public void setObservationTimeRFC822(String observationTimeRFC822) {
		this.observationTimeRFC822 = observationTimeRFC822;
	}
	public String getObservationEpoch() {
		return observationEpoch;
	}
	public void setObservationEpoch(String observationEpoch) {
		this.observationEpoch = observationEpoch;
	}
	public String getLocalTimeRFC822() {
		return localTimeRFC822;
	}
	public void setLocalTimeRFC822(String localTimeRFC822) {
		this.localTimeRFC822 = localTimeRFC822;
	}
	public String getLocalEpoch() {
		return localEpoch;
	}
	public void setLocalEpoch(String localEpoch) {
		this.localEpoch = localEpoch;
	}
	public String getLocalTZShort() {
		return localTZShort;
	}
	public void setLocalTZShort(String localTZShort) {
		this.localTZShort = localTZShort;
	}
	public String getLocalTZLong() {
		return localTZLong;
	}
	public void setLocalTZLong(String localTZLong) {
		this.localTZLong = localTZLong;
	}
	public String getLocalTZOffset() {
		return localTZOffset;
	}
	public void setLocalTZOffset(String localTZOffset) {
		this.localTZOffset = localTZOffset;
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
	public String getRelativeHumidity() {
		return relativeHumidity;
	}
	public void setRelativeHumidity(String relativeHumidity) {
		this.relativeHumidity = relativeHumidity;
	}
	public String getWindString() {
		return windString;
	}
	public void setWindString(String windString) {
		this.windString = windString;
	}
	public String getWindGustKph() {
		return windGustKph;
	}
	public void setWindGustKph(String windGustKph) {
		this.windGustKph = windGustKph;
	}
	public String getWindDir() {
		return windDir;
	}
	public void setWindDir(String windDir) {
		this.windDir = windDir;
	}
	public String getWindDegrees() {
		return windDegrees;
	}
	public void setWindDegrees(String windDegrees) {
		this.windDegrees = windDegrees;
	}
	public String getWindMph() {
		return windMph;
	}
	public void setWindMph(String windMph) {
		this.windMph = windMph;
	}
	public String getWindGustMph() {
		return windGustMph;
	}
	public void setWindGustMph(String windGustMph) {
		this.windGustMph = windGustMph;
	}
	public String getWindKph() {
		return windKph;
	}
	public void setWindKph(String windKph) {
		this.windKph = windKph;
	}
	public String getPressureMb() {
		return pressureMb;
	}
	public void setPressureMb(String pressureMb) {
		this.pressureMb = pressureMb;
	}
	public String getPressureIn() {
		return pressureIn;
	}
	public void setPressureIn(String pressureIn) {
		this.pressureIn = pressureIn;
	}
	public String getPressureTrend() {
		return pressureTrend;
	}
	public void setPressureTrend(String pressureTrend) {
		this.pressureTrend = pressureTrend;
	}
	public String getDewpointString() {
		return dewpointString;
	}
	public void setDewpointString(String dewpointString) {
		this.dewpointString = dewpointString;
	}
	public String getDewpointF() {
		return dewpointF;
	}
	public void setDewpointF(String dewpointF) {
		this.dewpointF = dewpointF;
	}
	public String getDewPointC() {
		return dewPointC;
	}
	public void setDewPointC(String dewPointC) {
		this.dewPointC = dewPointC;
	}
	public String getHeatIndexString() {
		return heatIndexString;
	}
	public void setHeatIndexString(String heatIndexString) {
		this.heatIndexString = heatIndexString;
	}
	public String getHeatIndexF() {
		return heatIndexF;
	}
	public void setHeatIndexF(String heatIndexF) {
		this.heatIndexF = heatIndexF;
	}
	public String getHeatIndexC() {
		return heatIndexC;
	}
	public void setHeatIndexC(String heatIndexC) {
		this.heatIndexC = heatIndexC;
	}
	public String getWindChillString() {
		return windChillString;
	}
	public void setWindChillString(String windChillString) {
		this.windChillString = windChillString;
	}
	public String getWindChillF() {
		return windChillF;
	}
	public void setWindChillF(String windChillF) {
		this.windChillF = windChillF;
	}
	public String getWindChillC() {
		return windChillC;
	}
	public void setWindChillC(String windChillC) {
		this.windChillC = windChillC;
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
	public String getVisibilityMi() {
		return visibilityMi;
	}
	public void setVisibilityMi(String visibilityMi) {
		this.visibilityMi = visibilityMi;
	}
	public String getVisibilityKm() {
		return visibilityKm;
	}
	public void setVisibilityKm(String visibilityKm) {
		this.visibilityKm = visibilityKm;
	}
	public String getSolarRadiation() {
		return solarRadiation;
	}
	public void setSolarRadiation(String solarRadiation) {
		this.solarRadiation = solarRadiation;
	}
	public String getuV() {
		return uV;
	}
	public void setuV(String uV) {
		this.uV = uV;
	}
	public String getPrecip1HrString() {
		return precip1HrString;
	}
	public void setPrecip1HrString(String precip1HrString) {
		this.precip1HrString = precip1HrString;
	}
	public String getPrecip1HrIn() {
		return precip1HrIn;
	}
	public void setPrecip1HrIn(String precip1HrIn) {
		this.precip1HrIn = precip1HrIn;
	}
	public String getPrecip1HrMetric() {
		return precip1HrMetric;
	}
	public void setPrecip1HrMetric(String precip1HrMetric) {
		this.precip1HrMetric = precip1HrMetric;
	}
	public String getPrecipTodayString() {
		return precipTodayString;
	}
	public void setPrecipTodayString(String precipTodayString) {
		this.precipTodayString = precipTodayString;
	}
	public String getPrecipTodayIn() {
		return precipTodayIn;
	}
	public void setPrecipTodayIn(String precipTodayIn) {
		this.precipTodayIn = precipTodayIn;
	}
	public String getPrecipTodayMetric() {
		return precipTodayMetric;
	}
	public void setPrecipTodayMetric(String precipTodayMetric) {
		this.precipTodayMetric = precipTodayMetric;
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
	public String getForecastUrl() {
		return forecastUrl;
	}
	public void setForecastUrl(String forecastUrl) {
		this.forecastUrl = forecastUrl;
	}
	public String getHistoryUrl() {
		return historyUrl;
	}
	public void setHistoryUrl(String historyUrl) {
		this.historyUrl = historyUrl;
	}
	public String getObUrl() {
		return obUrl;
	}
	public void setObUrl(String obUrl) {
		this.obUrl = obUrl;
	}

}
