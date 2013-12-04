package com.expedia.service;

import com.expedia.rest.Weather;

public interface WeatherInfoService {

	public Weather getConditionsByZip(Integer zip);
	
}
