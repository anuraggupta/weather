package com.expedia.service.impl;

import com.expedia.rest.Weather;
import com.expedia.service.WeatherInfoService;

public class WunderGroundWeatherInfoService implements WeatherInfoService {

	public static final String API_HOST = "http://api.wunderground.com/api/";
	
	public static final String KEY = "ed044d75b91fb500";
	
	public static final String CONDITION_END_POINT = "/conditions/q/:zip.json";

	
	
	public Weather getConditionsByZip(Integer zip) {
		// TODO Auto-generated method stub
		return null;
	}

}
