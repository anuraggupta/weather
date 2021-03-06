package com.expedia.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.expedia.rest.UIError;
import com.expedia.rest.UIResponse;
import com.expedia.rest.UISuccessResponse;
import com.expedia.weather.service.WeatherService;
import com.expedia.weather.service.pojo.WeatherConditions;

@Controller
@RequestMapping(value = "conditions")
public class WeatherController {

	private static final String ZIP_CODE_PATTERN = "^\\d{5}$";
	@Autowired
	private WeatherService weatherService;

	@RequestMapping(value = "zip", method = RequestMethod.POST)
	public @ResponseBody
	UIResponse getByZip(String zip) {
		if (!zip.matches(ZIP_CODE_PATTERN)) {

			return new UIError("invalidinput", "invalid zip code format");
		}

		WeatherConditions conditionsByZip = weatherService
				.getConditionsByZip(zip);

		if (null == conditionsByZip) {

			return new UIError("apiunavailable", "unable to connect to API");
		} else if (null != conditionsByZip.getResponse().getError()) {

			return new UIError("querynotfound".equals(conditionsByZip
					.getResponse().getError().getType()) ? "zipnotfound"
					: conditionsByZip.getResponse().getError().getType(),
					"querynotfound".equals(conditionsByZip.getResponse()
							.getError().getType()) ? "zipcode not found"
							: conditionsByZip.getResponse().getError()
									.getDescription());
		}

		return new UISuccessResponse(conditionsByZip);
	}

	public void setWeatherService(WeatherService weatherService) {
		this.weatherService = weatherService;
	}
}
