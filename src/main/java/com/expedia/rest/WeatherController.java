package com.expedia.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expedia.weather.service.WeatherService;
import com.expedia.weather.service.Zip;

@Controller
@RequestMapping( value = "conditions" )
public class WeatherController {

	@Autowired
	WeatherService weatherService;
	
	@RequestMapping("/zip/{zip}")
    public @ResponseBody WeatherConditions getByZip(
            @PathVariable Zip zip) {
        return weatherService.getConditionsByZip(zip);
    }
	
}
