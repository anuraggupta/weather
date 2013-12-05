package com.expedia.configuration;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
@PropertySource("classpath:app.properties")
@EnableWebMvc
public class SpringConfig extends WebMvcConfigurerAdapter {

	@Bean(name = "restTemplate")
	public RestTemplate restTemplate() {

		RestTemplate rt = new RestTemplate();
		return rt;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/*.html").addResourceLocations("/");
	}

	@Override
	public void configureMessageConverters(
			List<HttpMessageConverter<?>> converters) {

		MappingJackson2HttpMessageConverter conv = new MappingJackson2HttpMessageConverter();
		conv.setObjectMapper(new ObjectMapper().configure(
				SerializationFeature.FAIL_ON_EMPTY_BEANS, false));

		converters.add(conv);

	}

}
