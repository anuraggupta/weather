package com.expedia.weather.service;

import com.expedia.weather.service.pojo.WeatherConditions;

public interface WeatherService {

	WeatherConditions getConditionsByZip(String zip);
}
