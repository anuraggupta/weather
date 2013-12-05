package com.expedia.rest;

public class UIError implements UIResponse {

	private String error;
	private String description;

	public UIError(String type, String desc) {
		this.error = type;
		this.description = desc;
	}

	public String getError() {
		return error;
	}

	public void setError(String type) {
		this.error = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
