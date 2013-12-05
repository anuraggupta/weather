package com.expedia.weather.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.expedia.rest.WeatherConditions;
import com.expedia.weather.service.WeatherService;

@Service
public class WunderGroundWeatherServiceImpl implements WeatherService {

	public static final String API = "http://api.wunderground.com/api/{key}";
	public static final String KEY = "ed044d75b91fb500";
	public static final String CONDITIONS = "/conditions/q/{zip}";

	public static final String DATA_TYPE = ".json";

	@Autowired
	private RestTemplate restTemplate;

	public WeatherConditions getConditionsByZip(String zip) {

		
		
		/*
		 * 
		 * This is code to post and return a Weather object
		 */
		WeatherConditions returns = null;
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("key", KEY);
		vars.put("zip", zip);
		String uri = API + CONDITIONS + DATA_TYPE;
		try {

			returns = restTemplate.getForObject(uri,
					WeatherConditions.class, vars);
		} catch (RestClientException rce) {
		}
		return returns;
	}

}
