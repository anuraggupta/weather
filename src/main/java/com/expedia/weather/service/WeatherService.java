package com.expedia.weather.service;

import com.expedia.rest.WeatherConditions;

public interface WeatherService {

	WeatherConditions getConditionsByZip(String zip);
}
