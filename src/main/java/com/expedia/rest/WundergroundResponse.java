package com.expedia.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WundergroundResponse {

	private String version;
	private String termsOfService;
	private WundergroundResponseError error;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTermsOfService() {
		return termsOfService;
	}

	public void setTermsOfService(String termsOfService) {
		this.termsOfService = termsOfService;
	}

	public WundergroundResponseError getError() {
		return error;
	}

	public void setError(WundergroundResponseError error) {
		this.error = error;
	}
}
