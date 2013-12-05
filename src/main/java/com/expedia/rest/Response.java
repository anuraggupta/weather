package com.expedia.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTermsOfService() {
		return termsOfService;
	}
	@JsonProperty("termsofService")
	public void setTermsOfService(String termsOfService) {
		this.termsOfService = termsOfService;
	}
	private String version;
	private String termsOfService;
}
