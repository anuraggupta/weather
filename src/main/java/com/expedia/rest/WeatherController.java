package com.expedia.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expedia.weather.service.WeatherService;
import com.expedia.weather.service.WeatherServiceConnectionException;
import com.expedia.weather.service.Zip;

@Controller
@RequestMapping(value = "conditions")
public class WeatherController {

	@Autowired
	WeatherService weatherService;

	@RequestMapping(value = "zip", method = RequestMethod.POST)
	public @ResponseBody
	WeatherConditionsResponse getByZip(@Valid Zip zip) {
		WeatherConditionsResponse conditionsByZip = null;
		try {

			conditionsByZip = weatherService.getConditionsByZip(zip);

		} catch (WeatherServiceConnectionException wsce) {
			
			
		}

		return conditionsByZip;
	}

}
