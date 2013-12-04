package com.expedia.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( value = "conditions" )
public class WeatherController {

	@RequestMapping("/zip/{zip}")
    public @ResponseBody Weather getByZip(
            @PathVariable Integer zip) {
        return new Weather(zip);
    }
	
}
