package com.expedia.weather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.expedia.rest.UIError;
import com.expedia.rest.UIResponse;
import com.expedia.rest.UISuccessResponse;
import com.expedia.rest.controller.WeatherController;
import com.expedia.weather.service.WeatherService;
import com.expedia.weather.service.pojo.CurrentObservation;
import com.expedia.weather.service.pojo.DisplayLocation;
import com.expedia.weather.service.pojo.WeatherConditions;
import com.expedia.weather.service.pojo.WundergroundResponse;
import com.expedia.weather.service.pojo.WundergroundResponseError;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class WeatherControllerTest {

	@Configuration
	@PropertySource("classpath:app.properties")
	static class TestConfig {

		@Bean
		public WeatherController weatherController() {
			return new WeatherController();
		}

		@Bean
		public WeatherService weatherService() {
			return Mockito.mock(WeatherService.class);
		}

	}
	
	@Autowired
	WeatherController controller;
	
	@Autowired
	WeatherService weatherService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetByZip() {

		// Valid ZIP CODE
		String zip = "90001";
		WeatherConditions weatherConditions = new WeatherConditions();
		CurrentObservation currentObservation = new CurrentObservation();
		currentObservation.setTempC("tempC");
		currentObservation.setTempF("tempF");
		DisplayLocation displayLocation = new DisplayLocation();
		displayLocation.setCity("city");
		displayLocation.setState("state");
		currentObservation.setDisplayLocation(displayLocation);
		weatherConditions.setCurrentObservation(currentObservation);
		WundergroundResponse response = new WundergroundResponse();
		weatherConditions.setResponse(response);
		Mockito.when(weatherService.getConditionsByZip(zip)).thenReturn(weatherConditions);
		
		UIResponse byZip = controller.getByZip(zip);

		assertTrue(byZip instanceof UISuccessResponse);

		UISuccessResponse res = (UISuccessResponse) byZip;

		assertNotNull(res.getCity());
		assertNotEquals(res.getCity(), "");

		assertNotNull(res.getState());
		assertNotEquals(res.getState(), "");

		assertNotNull(res.getTempF());
		assertNotEquals(res.getTempF(), "");

	}

	@Test
	public void testGetByInvalidZip() {

		// InValid ZIP CODE
		// Less than 5 numbers
		String zip = "9001";
		UIResponse byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);

		// Longer ZIP CODE
		zip = "900001";
		byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);

		// Alphabetic
		zip = "asdada";
		byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);

		// Alphanumeric
		zip = "a990dada";
		byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);

	}

	@Test
	public void textGetByNonExistantZip() {
		String zip = "90000";
		
		WeatherConditions weatherConditions = new WeatherConditions();

		WundergroundResponse response = new WundergroundResponse();
		weatherConditions.setResponse(response);
		WundergroundResponseError error = new WundergroundResponseError();
		error.setType("querynotfound");
		error.setDescription("Requested city not found");
		
		response.setError(error);
		Mockito.when(weatherService.getConditionsByZip(zip)).thenReturn(weatherConditions);
		
		UIResponse byZip = controller.getByZip(zip);

		assertTrue(byZip instanceof UIError);

		UIError res = (UIError) byZip;

		assertEquals("zipnotfound", res.getError());
		assertEquals("zipcode not found", res.getDescription());

	}

	private void assertInvalidZip(UIResponse byZip) {
		assertTrue(byZip instanceof UIError);

		UIError res = (UIError) byZip;

		assertEquals("invalidinput", res.getError());
		assertEquals("invalid zip code format", res.getDescription());

	}

}
