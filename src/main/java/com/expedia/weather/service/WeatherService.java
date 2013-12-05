package com.expedia.weather.service;

import com.expedia.rest.WeatherConditionsResponse;

public interface WeatherService {

	WeatherConditionsResponse getConditionsByZip(Zip zip) throws WeatherServiceConnectionException;
}
