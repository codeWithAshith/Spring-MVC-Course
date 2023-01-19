package com.codewithashith.model;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String state;
	private String favoriteLanguage;
	private String[] operatingSystem;
	private LinkedHashMap<String, String> stateOptions;

	public Student() {

		// populate state using java
		stateOptions = new LinkedHashMap<String, String>();
		
		stateOptions.put("TN", "Tamil Nadu");
		stateOptions.put("KL", "Kerala");
		stateOptions.put("MI", "Mumbai");

	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LinkedHashMap<String, String> getStateOptions() {
		return stateOptions;
	}

	public void setStateOptions(LinkedHashMap<String, String> stateOptions) {
		this.stateOptions = stateOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}
