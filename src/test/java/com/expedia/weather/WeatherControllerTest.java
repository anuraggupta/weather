package com.expedia.weather;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.expedia.rest.UIError;
import com.expedia.rest.UIResponse;
import com.expedia.rest.UISuccessResponse;
import com.expedia.rest.controller.WeatherController;
import com.expedia.weather.service.WeatherService;
import com.expedia.weather.service.impl.WunderGroundWeatherServiceImpl;

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
			return new WunderGroundWeatherServiceImpl();
		}

		@Bean
		public RestTemplate restTemplate() {
			return new RestTemplate();
		}

		@Bean
		public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
			return new PropertySourcesPlaceholderConfigurer();
		}
	}

	@Autowired
	WeatherController controller;

	@Test
	public void testGetByZip() {

		// Valid ZIP CODE
		String zip = "90001";
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
		
		//Alphabetic
		zip = "asdada";
		byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);
		
		//Alphanumeric
		zip = "a990dada";
		byZip = controller.getByZip(zip);
		assertInvalidZip(byZip);

	}
	
	@Test
	public void textGetByNonExistantZip(){
		String zip = "90000";
		UIResponse byZip = controller.getByZip(zip);

		assertTrue(byZip instanceof UIError);

		UIError res = (UIError) byZip;

		assertEquals("querynotfound", res.getError());
		assertEquals("zipcode not found", res.getDescription());
		
	}

	private void assertInvalidZip(UIResponse byZip) {
		assertTrue(byZip instanceof UIError);

		UIError res = (UIError) byZip;

		assertEquals("invalidinput", res.getError());
		assertEquals("invalid zip code format", res.getDescription());

	}

}
