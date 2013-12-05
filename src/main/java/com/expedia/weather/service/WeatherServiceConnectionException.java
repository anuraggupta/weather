package com.expedia.weather.service;

public class WeatherServiceConnectionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1038563023713040719L;

	public WeatherServiceConnectionException(String msg, Throwable e) {
		super(msg, e);
	}
	
	public WeatherServiceConnectionException(String msg) {
		super(msg);
	}
}
