package com.expedia.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WeatherAppInitializer implements WebApplicationInitializer {

	public static final String basePackage = "com.expedia";

	public void onStartup(ServletContext sc) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.scan(basePackage);
		sc.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic appServlet = sc.addServlet("appServlet",
				new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");
	}

}
